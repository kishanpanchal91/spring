package com.kp.services;

import java.util.List;

import com.kp.data.User;

/**
 * @author kishan.panchal
 *
 */
public interface ICrudOperationsServices {

	public void createUser(User user);

	public List<User> getUsers();

	public void updateUser(User user);

	public void deleteUser(String i);

	public User getUserById(String id);

}
