package com.sleepstory.model;

import java.util.List;
import java.util.Set;

import com.sleepstory.enums.AvailabilityStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	private String roomType;
	
	private List<String> amenities;
	
	@ManyToOne
	private Hotel hotelId;
	
	private Integer pricePerNight;
	
	private AvailabilityStatus availabilityStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Booking> bookings;
	
	
}
