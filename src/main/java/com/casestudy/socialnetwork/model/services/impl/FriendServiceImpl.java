package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.Friend;
import com.casestudy.socialnetwork.model.repositories.FriendRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    private FriendRepository friendRepository;

    @Override
    public List<Friend> getAll() {
        return friendRepository.findAll();
    }

    @Override
    public Optional<Friend> findById(int id) {
        return friendRepository.findById(id);
    }

    @Override
    public Friend save(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public void delete(int id) {
        friendRepository.deleteById(id);
    }
}
