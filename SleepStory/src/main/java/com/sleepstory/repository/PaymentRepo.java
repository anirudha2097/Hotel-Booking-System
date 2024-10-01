package com.sleepstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sleepstory.model.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
