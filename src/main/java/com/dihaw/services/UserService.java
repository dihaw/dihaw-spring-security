package com.dihaw.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dihaw.controller.exception.UserNotFoundException;
import com.dihaw.dto.ResponseDTO;
import com.dihaw.entity.User;
import com.dihaw.entity.UserStatus;

public interface UserService {
	
	public Page<User> users(Pageable pageable);
	
	public User getUserById(String id) throws UserNotFoundException;
	
	public void updateUser(User user) throws UserNotFoundException;
	
	public void deleteUser(String id) throws UserNotFoundException;
	
	public ResponseDTO registerUser(User user);

	public void changeStatus(String id, UserStatus userStatus) throws UserNotFoundException;
	
	public void updateLastConnection( String username) throws UserNotFoundException;
	
	public User getUserByUsername(String username);

	public void changeAccountExpired(String id, String value) throws UserNotFoundException;

	public void changeAccountLocked(String id, String value) throws UserNotFoundException;

	public void changeCredentialsExpired(String id, String value) throws UserNotFoundException;

}
