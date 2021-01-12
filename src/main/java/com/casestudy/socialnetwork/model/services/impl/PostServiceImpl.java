package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.Post;
import com.casestudy.socialnetwork.model.repositories.PostRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void delete(int id) {
        postRepository.deleteById(id);
    }
}
