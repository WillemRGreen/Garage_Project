package com;

public class Vehicle {
	
	protected String make;
	protected String model;
	protected int miles;
	protected Boolean running;
	protected int year;
	
	public Vehicle(String make, String model, int miles, Boolean running, int year) {
		
		
		this.make = make;
		this.model = model;
		this.miles = miles;
		this.running = running;
		this.year = year;
		
	}
		
	public String getMake() {
		return make;
			
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
		
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMiles() {
		return miles;
		
	}
	
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	public Boolean getRunning() {
		return running;
		
	}
	
	public void setRunning(Boolean running) {
		this.running = running;
	}
	
	public int getYear() {
		return year;
		
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	

}
