package org.Project.RestaurantManagementProject.repository;

import java.util.List;

import org.Project.RestaurantManagementProject.model.TablesInRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<TablesInRestaurant, Long>{

	List<TablesInRestaurant> findByBookedFalse();
	
}
