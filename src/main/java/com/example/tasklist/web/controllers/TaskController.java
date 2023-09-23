package com.example.tasklist.web.controllers;

import com.example.tasklist.service.TaskService;
import com.example.tasklist.web.dto.task.TaskDto;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.example.tasklist.web.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    private final TaskMapper taskMapper;

    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class) @RequestBody TaskDto taskDto) {
        return taskMapper.toDto(taskService.update(taskMapper.toEntity(taskDto)));
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        return taskMapper.toDto(taskService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }
}
