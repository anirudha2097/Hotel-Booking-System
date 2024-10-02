package com.sleepstory.service;

import com.sleepstory.exceptions.RoomException;
import com.sleepstory.model.Room;

public interface RoomService {

	public Room addRoom(Room room) throws RoomException;
	
	public String deleteRoom(Integer roomId) throws RoomException;
	
	public Room updateRoomDetails(Integer roomId, Room room) throws RoomException;
	
	public Room getRoom(Integer roomId) throws RoomException;
	
}
