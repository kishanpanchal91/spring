package com.example.mvc.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityJpaRepository extends JpaRepository<City, Long> {

	@Modifying(clearAutomatically = true)
	@Query("update City c set c.name =:name, c.state = :state where c.id =:id")
	void updateCity(@Param("id") Long id, @Param("name") String name, @Param("state") String state);
}
