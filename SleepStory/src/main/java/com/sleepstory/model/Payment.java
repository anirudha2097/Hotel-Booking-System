package com.sleepstory.model;

import java.time.LocalDateTime;

import com.sleepstory.enums.PaymentMethod;
import com.sleepstory.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer paymentId;
	
	@OneToOne
	private Booking bookingId;
	
	private Integer amount; 
	
	private PaymentMethod paymentMethod;
	
	private PaymentStatus paymentStatus;
	
	private LocalDateTime createdAt;
	
}
