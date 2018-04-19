package com.kp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kp.data.User;

/**
 * @author kishan.panchal
 *
 */
public interface ICrudOperationsDao extends MongoRepository<User, String> {

}
