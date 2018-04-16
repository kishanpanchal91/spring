package com.kp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kp.dao.ICrudOperationsDao;
import com.kp.data.User;
import com.kp.services.ICrudOperationsServices;

/**
 * @author kishan.panchal
 *
 */
@Service
public class CrudOperationsServices implements ICrudOperationsServices {

	@Autowired
	ICrudOperationsDao dao;
	
	@Override
	public void createUser(User user) {
		dao.save(user);
	}

	@Override
	public List<User> getUsers() {
		return dao.findAll();
	}

	@Override
	public void updateUser(User user) {
		dao.save(user);	
	}

	@Override
	public void deleteUser(String i) {
		dao.deleteById(i);			
	}

	@Override
	public User getUserById(String id) {
		Optional<User> users = dao.findById(id);
		return users.get();
	}

}
