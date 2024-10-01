package com.sleepstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sleepstory.model.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
