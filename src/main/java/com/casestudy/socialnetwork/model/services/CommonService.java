package com.casestudy.socialnetwork.model.services;


import java.util.List;
import java.util.Optional;

public interface CommonService<T> {

    List<T> getAll();

    Optional<T> findById(int id);

    T save(T t);

    void delete(int id);
}
