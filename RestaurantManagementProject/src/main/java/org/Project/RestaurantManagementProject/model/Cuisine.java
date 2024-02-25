package org.Project.RestaurantManagementProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cuisine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cusineId;

    private String cusineName;

    private double cusinePrice;

	public Long getCusineId() {
		return cusineId;
	}

	public void setCusineId(Long cusineId) {
		this.cusineId = cusineId;
	}

	public String getCusineName() {
		return cusineName;
	}

	public void setCusineName(String cusineName) {
		this.cusineName = cusineName;
	}

	public double getCusinePrice() {
		return cusinePrice;
	}

	public void setCusinePrice(double cusinePrice) {
		this.cusinePrice = cusinePrice;
	}

    
}