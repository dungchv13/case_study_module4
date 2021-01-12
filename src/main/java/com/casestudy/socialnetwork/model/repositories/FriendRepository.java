package com.casestudy.socialnetwork.model.repositories;


import com.casestudy.socialnetwork.model.entities.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend,Integer> {
}
