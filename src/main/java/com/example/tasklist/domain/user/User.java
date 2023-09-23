package com.example.tasklist.domain.user;

import com.example.tasklist.domain.task.Task;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;

    public List<Task> getTasks() {
        if (tasks == null) {
            tasks = new ArrayList<>();
        }
        return tasks;
    }
}
