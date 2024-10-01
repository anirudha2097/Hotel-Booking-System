package com.sleepstory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

	private String location;
	
	private String city;
	
	private String state;
	
	private String country;
	
}
