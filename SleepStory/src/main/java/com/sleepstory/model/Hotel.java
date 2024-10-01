package com.sleepstory.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;
	
	@OneToOne
	private User ownerId;
	
	private String hotelName;
	
	@Embedded
	private Address address;
	
	private String phNo;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Room> rooms;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Booking> bookings;
	
	private Integer rating;
	
	private LocalDateTime createdAt;
	
	
}
