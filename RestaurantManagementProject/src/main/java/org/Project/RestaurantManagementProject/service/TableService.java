package org.Project.RestaurantManagementProject.service;

import java.util.List;
import java.util.Optional;

import org.Project.RestaurantManagementProject.model.Cuisine;
import org.Project.RestaurantManagementProject.model.TablesInRestaurant;
import org.Project.RestaurantManagementProject.repository.CuisineRepository;
import org.Project.RestaurantManagementProject.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;
    
    @Autowired
    private CuisineRepository cuisineRepository;
    
    public TablesInRestaurant addTable(TablesInRestaurant table) {
        return tableRepository.save(table);
    }

    public List<TablesInRestaurant> getAllTables() {
        return tableRepository.findAll();
    }

    public TablesInRestaurant getTableById(Long id) {
        return tableRepository.findById(id).orElse(null);
    }
    
    
    public List<TablesInRestaurant> getAvailableTables() {
        return tableRepository.findByBookedFalse();
    }

    public String bookTable(Long id, Long cuisineId) {
        Optional<TablesInRestaurant> optionalTable = tableRepository.findById(id);
        Optional<Cuisine> optionalCuisine = cuisineRepository.findById(cuisineId);
        if (optionalTable.isPresent() && optionalCuisine.isPresent()) {
            TablesInRestaurant table = optionalTable.get();
            if (table.isBooked() ) {
                return "Table already booked!";
            } else {
            	Cuisine cuisine = optionalCuisine.get();
                table.setCuisine(cuisine);
                table.setBooked(true); 
                tableRepository.save(table);
                return "Table booked successfully";
            }
        }
        return "Table not found";
    }
    public String setTableAsAvailable(Long id) {
        Optional<TablesInRestaurant> optionalTable = tableRepository.findById(id);
        if (optionalTable.isPresent()) {
            TablesInRestaurant table = optionalTable.get();
            if (table.isBooked()) {
                table.setBooked(false); 
                tableRepository.save(table);
                return "Table set as available successfully";
            } else {
                return "Table is not yet booked";
            }
        }
        return "Table not found";
    }
}