package org.Project.RestaurantManagementProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cuisine {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CusineId;

    private String CusineName;
    private double CusinePrice;

	public double getPrice() {
		return CusinePrice;
	}

	public void setPrice(double CusinePrice) {
		this.CusinePrice = CusinePrice;
	}

	public Long getCusineId() {
		return CusineId;
	}

	public void setCusineId(Long Cusineid) {
		this.CusineId = Cusineid;
	}

	public String getCusineName() {
		return CusineName;
	}

	public void setCusineName(String name) {
		this.CusineName = name;
	}

	public double calculatePrice(int quantity) {
        return CusinePrice * quantity;
	}
   
}

