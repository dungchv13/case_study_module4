package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.UserRole;
import com.casestudy.socialnetwork.model.repositories.UserRoleRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public Optional<UserRole> findById(int id) {
        return userRoleRepository.findById(id);
    }

    @Override
    public UserRole save(UserRole account) {
        return userRoleRepository.save(account);
    }

    @Override
    public void delete(int id) {
        userRoleRepository.deleteById(id);
    }
}
