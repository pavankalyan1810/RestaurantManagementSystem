package org.Project.RestaurantManagementProject.controller;

import java.util.List;
import java.util.Optional;

import org.Project.RestaurantManagementProject.model.Cuisine;
import org.Project.RestaurantManagementProject.service.CuisineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuisines")
public class CuisineController {

    @Autowired
    private CuisineService cuisineService;

    @GetMapping
    public List<Cuisine> getAllCuisines() {
        return cuisineService.getAllCuisines();
    }

    @GetMapping("/{id}")
    public Optional<Cuisine> getCuisineById(@PathVariable Long id) {
        return cuisineService.getCuisineById(id);
    }

    @PostMapping
    public Cuisine addCuisine(@RequestBody Cuisine cuisine) {
        return cuisineService.addCuisine(cuisine);
    }

//    @GetMapping("/search")
//    public List<Cuisine> searchCuisine(
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) Double price) {
//        if (name != null) {
//            return cuisineService.getCuisineByName(name);
//        } else if (price != null) {
//            return cuisineService.getCuisineByPrice(price);
//        } else {
//            return cuisineService.getAllCuisines();
//        }
//    }

  
}