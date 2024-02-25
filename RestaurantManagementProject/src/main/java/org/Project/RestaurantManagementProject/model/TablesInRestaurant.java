package org.Project.RestaurantManagementProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Tables_List")
public class TablesInRestaurant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(unique = true)
    private String tableName;
    private boolean booked;
    
    @ManyToOne
    private Cuisine cuisine;
    
    
    //cuisine setters and getters
	public Cuisine getCuisine() {
		return cuisine;
	}
	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public boolean isBooked() {
		return booked;
	}
	public void setBooked(boolean booked) {
		this.booked = booked;
	}
    
    	

}
