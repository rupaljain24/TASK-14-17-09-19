package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id
	private int regno;
	private String brand;
	private String model;
	private int price;
	
	@ManyToOne
	private Emp emp;

	
	
	public Vehicle(int regno, String brand, String model, int price) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", brand=" + brand + ", model="
				+ model + ", price=" + price +  "]";
	}



	public Vehicle(int regno, String brand, String model, int price, Emp emp) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.emp = emp;
	}



	public Vehicle() {
		super();
	}

	public Vehicle(int regno) {
		super();
		this.regno = regno;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	
}