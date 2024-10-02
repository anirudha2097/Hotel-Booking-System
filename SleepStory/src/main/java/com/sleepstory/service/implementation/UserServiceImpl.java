package com.sleepstory.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sleepstory.dto.LoginDto;
import com.sleepstory.exceptions.UserException;
import com.sleepstory.model.User;
import com.sleepstory.repository.UserRepo;
import com.sleepstory.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo; 
	
	
	@Override
	public User registerUser(User user) throws UserException {
		
		if(user == null) {
			throw new UserException("User details not found!");
		} else {
			User registeredUser = userRepo.save(user);

			return registeredUser;
		}
	}

	@Override
	public User loginUser(LoginDto loginDto) throws UserException {
		
		User savedUser = userRepo.findByEmail(loginDto.getUsername());
		
		if(savedUser == null) {
			throw new UserException("User not found please register first!");
		} else {
			if(savedUser.getPassword().equals(loginDto.getPassword())) {
				return savedUser;
			} else {
				throw new UserException("Invalid credentials");
			}
		}
		
	}

	@Override
	public String deleteUser(Integer userId) throws UserException {

		Optional<User> user = userRepo.findById(userId);
		
		if(user.isEmpty()) {
			throw new UserException("user not found!");
		} else {
			userRepo.delete(user.get());
			
			return "User deleted succesfully";
		}
	}

	@Override
	public User updateUserDetails(Integer userId, User user) throws UserException {
		
		Optional<User> existingUser = userRepo.findById(userId);
		
		if(existingUser.isEmpty()) {
			throw new UserException("User not found!");
		} else {
			return userRepo.save(user);
		}
		
	}

}
