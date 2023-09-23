package com.example.tasklist.web.controllers;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.domain.user.User;
import com.example.tasklist.service.MyUserService;
import com.example.tasklist.service.TaskService;
import com.example.tasklist.web.dto.task.TaskDto;
import com.example.tasklist.web.dto.user.UserDto;
import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.example.tasklist.web.mappers.TaskMapper;
import com.example.tasklist.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final MyUserService userService;
    private final TaskService taskService;
    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto userDto) {
        return userMapper.toDto(userService.update(userMapper.toEntity(userDto)));
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        return userMapper.toDto(userService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/tasks/{id}")
    public List<TaskDto> getByUserTasksById(@PathVariable Long id) {
        return taskMapper.toDto(taskService.getAllByUserId(id));
    }

    @PostMapping("/tasks/{id}")
    public TaskDto createTask(@PathVariable Long id, @Validated(OnCreate.class) @RequestBody TaskDto taskDto) {
        User user = userService.getById(id);
        Task task = taskMapper.toEntity(taskDto);
        user.getTasks().add(task);
        return taskMapper.toDto(task);
    }
}
