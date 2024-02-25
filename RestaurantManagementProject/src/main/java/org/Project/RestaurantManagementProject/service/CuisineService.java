package org.Project.RestaurantManagementProject.service;

import java.util.List;

import org.Project.RestaurantManagementProject.model.Cuisine;
import org.Project.RestaurantManagementProject.repository.CuisineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuisineService {


    @Autowired
    private CuisineRepository cuisineRepository;

    public List<Cuisine> getAllCuisines() {
        return cuisineRepository.findAll();
    }

    public Cuisine addCuisine(Cuisine cuisine) {
        return cuisineRepository.save(cuisine);
    }

    public Cuisine getCuisineById(Long id) {
        return cuisineRepository.findById(id).orElse(null);
    }

    public List<Cuisine> getCuisineByName(String name) {
        return cuisineRepository.findByName(name);
    }

    

    public List<Cuisine> getCuisineByPrice(double price) {
        return cuisineRepository.findByPrice(price);
    }

    public double calculateTotalCost(Long cuisineId, int quantity) {
        Cuisine cuisine = getCuisineById(cuisineId);
        if (cuisine != null) {
            return cuisine.calculatePrice(quantity);
        }
        return 0;
    }
}
