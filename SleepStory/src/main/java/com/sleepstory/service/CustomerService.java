package com.sleepstory.service;

import java.util.List;

import com.sleepstory.exceptions.BookingException;
import com.sleepstory.exceptions.HotelException;
import com.sleepstory.exceptions.RoomException;
import com.sleepstory.exceptions.UserException;
import com.sleepstory.model.Booking;

public interface CustomerService {

	public String bookRoom(Integer userId, Integer hotelId, Integer roomId) throws BookingException, UserException, HotelException, RoomException;
	
	public List<Booking> getAllBooking(Integer userId) throws BookingException;
	
}
