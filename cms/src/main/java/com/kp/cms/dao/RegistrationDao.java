package com.kp.cms.dao;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

import com.kp.cms.vo.RegistrationRequestVO;

@Repository
public class RegistrationDao {

	static final Logger logger = Logger.getLogger("RegistrationDao");
	public void save(RegistrationRequestVO registrationRequestVO) {
		logger.info("RegistrationDao called");
	}
	
}