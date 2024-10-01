package com.sleepstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sleepstory.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
