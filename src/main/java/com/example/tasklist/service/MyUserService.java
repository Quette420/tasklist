package com.example.tasklist.service;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;

public interface MyUserService {

    User getById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    User insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);
}
