package com.example.mvc.city;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityService {

	private static final Logger logger = LoggerFactory.getLogger(CityService.class.getSimpleName());

	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CityDao cityDao;
	
	@Autowired
	CityJpaRepository cityJpaRepository;

	public void addCity(String name, String state) {
		logger.info("addCity service called.....");
		
		City city = new City();
		city.setName(name);
		city.setState(state);
		
		cityRepository.save(city);
		logger.info("addCity service END.....");
	}
	
	public List<City> getCityList(){
		logger.info("getCityList service called.....");
		return cityDao.getCityList();
	}

	public void deleteCity(Long id) {
		logger.info("deleteCity service called.....");
		cityJpaRepository.deleteById(id);
	}

	public Optional<City> getCityById(Long id) {
		cityJpaRepository.findById(id);
		return cityJpaRepository.findById(id);
	}

	@Transactional
	public void updateCity(City city, Long id) throws Exception {
		try {
			cityJpaRepository.updateCity(id, city.getName(), city.getState());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
