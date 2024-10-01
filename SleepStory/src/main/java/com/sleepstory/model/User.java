package com.sleepstory.model;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.annotation.Transient;

import com.sleepstory.enums.UserRole;

import jakarta.persistence.CascadeType;
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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	@Transient
	private String password;
	
	private String mobNo;
	
	private UserRole userRole;
	
	private LocalDateTime createdAt;
	
	@OneToOne
	private Hotel hotelId;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Booking> bookings;
	
}
