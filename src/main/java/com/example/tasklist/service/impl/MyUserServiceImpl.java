package com.example.tasklist.service.impl;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;
import com.example.tasklist.service.MyUserService;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User insertUserRole(Long userId, Role role) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
