package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.User;
import com.casestudy.socialnetwork.model.repositories.UserRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
