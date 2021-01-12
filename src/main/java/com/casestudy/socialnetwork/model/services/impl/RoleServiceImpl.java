package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.Role;
import com.casestudy.socialnetwork.model.repositories.RoleRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(int id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void delete(int id) {
        roleRepository.deleteById(id);
    }
}
