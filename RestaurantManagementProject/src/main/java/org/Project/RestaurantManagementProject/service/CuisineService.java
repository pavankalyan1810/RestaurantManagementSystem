package org.Project.RestaurantManagementProject.service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Cuisine> getCuisineById(Long id) {
        return cuisineRepository.findById(id);
    }

    public List<Cuisine> getCuisineByName(String name) {
        return cuisineRepository.findByCusineName(name);
    }

    public List<Cuisine> getCuisineByPrice(double price) {
        return cuisineRepository.findByCusinePrice(price);
    }

    // Additional methods for CRUD operations
}