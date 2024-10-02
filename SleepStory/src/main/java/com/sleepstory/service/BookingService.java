package com.sleepstory.service;

import java.util.List;

import com.sleepstory.exceptions.BookingException;
import com.sleepstory.model.Booking;

public interface BookingService {

	public Booking addBooking(Booking booking) throws BookingException;
	
	public Booking getBooking(Integer bookingId) throws BookingException;
	
	public String deleteBooking(Integer bookingId) throws BookingException;
	
	public Booking updateBooking(Integer bookingId) throws BookingException;
	
	public List<Booking> showAllBookingsByRoom(Integer roomId) throws BookingException;
	
	public List<Booking> showAllBookingsByHotel(Integer hotelId) throws BookingException;
}
