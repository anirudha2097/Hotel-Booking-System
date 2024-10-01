package com.sleepstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sleepstory.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
