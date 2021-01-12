package com.casestudy.socialnetwork.model.repositories;


import com.casestudy.socialnetwork.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
