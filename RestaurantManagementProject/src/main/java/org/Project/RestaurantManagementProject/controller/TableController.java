package org.Project.RestaurantManagementProject.controller;

import java.util.List;

import org.Project.RestaurantManagementProject.model.TablesInRestaurant;
import org.Project.RestaurantManagementProject.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tables")
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping
    public List<TablesInRestaurant> getAllTables() {
        return tableService.getAllTables();
    }
    
    @GetMapping("/available")
    public List<TablesInRestaurant> getAvailableTables() {
        return tableService.getAvailableTables();
    }

    @GetMapping("/{id}")
    public TablesInRestaurant getTableById(@PathVariable Long id) {
        return tableService.getTableById(id);
    }
    
    @PostMapping("/add")
    public String addTable(@RequestBody TablesInRestaurant table) {
        tableService.addTable(table);
        return "Table added successfully";
    }

    
    @PostMapping("/{id}/book")
    public ResponseEntity<?> bookTable(@PathVariable Long id, @RequestParam Long CusineId) {
        return new ResponseEntity<>(tableService.bookTable(id,CusineId),HttpStatus.OK);
    }
   
    
    @PostMapping("/{id}/set-available")
    public ResponseEntity<?> setTableAsAvailable(@PathVariable Long id) {
        return new ResponseEntity<>(tableService.setTableAsAvailable(id),HttpStatus.OK);
    	
    }
}