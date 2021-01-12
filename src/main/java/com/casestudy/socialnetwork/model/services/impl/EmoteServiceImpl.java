package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.Emote;
import com.casestudy.socialnetwork.model.repositories.EmoteRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.EmoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmoteServiceImpl implements EmoteService {
    @Autowired
    private EmoteRepository emoteRepository;
    
    @Override
    public List<Emote> getAll() {
        return emoteRepository.findAll();
    }

    @Override
    public Optional<Emote> findById(int id) {
        return emoteRepository.findById(id);
    }

    @Override
    public Emote save(Emote emote) {
        return emoteRepository.save(emote);
    }

    @Override
    public void delete(int id) {
        emoteRepository.deleteById(id);
    }
}
