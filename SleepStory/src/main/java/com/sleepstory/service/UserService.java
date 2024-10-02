package com.sleepstory.service;

import com.sleepstory.dto.LoginDto;
import com.sleepstory.exceptions.UserException;
import com.sleepstory.model.User;

public interface UserService {

	public User registerUser(User user) throws UserException;
	
	public User loginUser(LoginDto loginDto) throws UserException;
	
	public String deleteUser(Integer userId) throws UserException;
	
	public User updateUserDetails(Integer userId,  User user) throws UserException;
	
	
}
