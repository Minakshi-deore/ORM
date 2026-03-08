package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private int vehicleId;
	private String vehicleName;
	private String vehicleType;
	private String vehiclebrand;
	private double price;
	private String color;
	
	public Vehicle(int vehicleId, String vehicleName, String vehicleType, String vehiclebrand, double price,
			String color) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehiclebrand = vehiclebrand;
		this.price = price;
		this.color = color;
	}

	public Vehicle() {
		
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehiclebrand() {
		return vehiclebrand;
	}

	public void setVehiclebrand(String vehiclebrand) {
		this.vehiclebrand = vehiclebrand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType
				+ ", vehiclebrand=" + vehiclebrand + ", price=" + price + ", color=" + color + "]";
	}

	
	
	

}
