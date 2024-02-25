package org.Project.RestaurantManagementProject.repository;

import java.util.List;
import java.util.Optional;

import org.Project.RestaurantManagementProject.model.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepository extends JpaRepository<Cuisine, Long> {

	Optional<Cuisine> findById(Long CusineId);
	
	List<Cuisine> findByName(String CusineName);
	
	List<Cuisine> findByPrice(double CusinePrice);

	

	
}
