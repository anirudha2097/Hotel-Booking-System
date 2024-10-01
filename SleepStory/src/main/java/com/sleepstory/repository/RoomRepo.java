package com.sleepstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sleepstory.model.Room;

public interface RoomRepo extends JpaRepository<Room, Integer> {

}
