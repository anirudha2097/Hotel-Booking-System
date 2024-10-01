package com.sleepstory.model;

import java.time.LocalDateTime;

import com.sleepstory.enums.BookingStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
	@ManyToOne
	private User userId;
	
	@ManyToOne
	private Room roomId;
	
	@ManyToOne
	private Hotel hotelId;
	
	private LocalDateTime checkInDate;
	
	private LocalDateTime checkOutDate;
	
	private Integer totalPrice;
	
	private BookingStatus bookingStatus;
	
	@OneToOne
	private Payment payment;
}
