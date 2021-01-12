package com.casestudy.socialnetwork.model.repositories;


import com.casestudy.socialnetwork.model.entities.Emote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmoteRepository extends JpaRepository<Emote,Integer> {
}
