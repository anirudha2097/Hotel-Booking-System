package com.sleepstory.service;

import java.util.List;

import com.sleepstory.exceptions.HotelException;
import com.sleepstory.model.Hotel;
import com.sleepstory.model.Room;

public interface HotelService {

	public Hotel addHotel(Hotel hotel) throws HotelException;
	
	public String deleteHotel(Hotel hotel) throws HotelException;
	
	public Hotel updateHotelDetails(Integer hotelId, Hotel hotel) throws HotelException;
	
	public Hotel showHotelDetails(Integer hotelId) throws HotelException;
	
	public List<Hotel> showAllHotelDetails() throws HotelException;

	public List<Room> showAllRooms(Integer hotelId) throws HotelException;
	
}
