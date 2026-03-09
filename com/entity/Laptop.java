package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int laptopId;
	String Brand;
	double price;
	
	public Laptop() {
		
	}

	public Laptop(int laptopId, String brand, double price) {
		super();
		this.laptopId = laptopId;
		Brand = brand;
		this.price = price;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", Brand=" + Brand + ", price=" + price + "]";
	}

}
