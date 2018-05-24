package com.example.mvc.city;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CityDao {
	
	private static final Logger logger = LoggerFactory.getLogger(CityService.class.getSimpleName());

	@PersistenceContext
	private EntityManager entityManager;

	public List<City> getCityList() {
		logger.info("getCityList called....");
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<City> criteriaQuery = builder.createQuery(City.class);
		
		Root<City> rootEntry = criteriaQuery.from(City.class);
		CriteriaQuery<City> all = criteriaQuery.select(rootEntry);
		
		TypedQuery<City> allQuery = entityManager.createQuery(all);
		List<City> cities = allQuery.getResultList();
		logger.info(cities.toString());
		return cities;
	}

}
