package com.example.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.mvc.city.City;
import com.example.mvc.city.CityJpaRepository;

@Component
public class CityRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CityRepositoryCommandLineRunner.class);

	@Autowired
	CityJpaRepository cityJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		logger.info("CommandLineRunner called....");
		List<City> cities = cityJpaRepository.findAll();
		logger.info("Fetched cities are " + cities);
	}

}
