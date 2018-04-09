package com.kp.cms.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kp.cms.dao.RegistrationDao;
import com.kp.cms.vo.RegistrationRequestVO;

@Service
public class RegistrationService {

	@Autowired
	RegistrationDao registrationDao;
	
	static final Logger logger = Logger.getLogger("RegistrationService");
	public void registerStudent(RegistrationRequestVO registrationRequestVO) {
		logger.info("RegistrationService called...");
		registrationDao.save(registrationRequestVO);
	}
}
