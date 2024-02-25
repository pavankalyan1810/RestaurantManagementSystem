package org.Project.RestaurantManagementProject.repository;


import java.util.List;

import org.Project.RestaurantManagementProject.model.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepository extends JpaRepository<Cuisine, Long> {

	List<Cuisine> findByCusineName(String name);
    List<Cuisine> findByCusinePrice(double price);
	
}
