package com;

public class Car extends Vehicle {
	
	protected int vehicleId;
	protected String driveType;
	protected String vehicleType = "car";
	
	public Car(
			String make, 
			String model, 
			int miles, 
			Boolean running, 
			int year, 
			int vehicleID, 
			String driveType) 
	{
		
				super(make, model, miles, running, year);
				setId(vehicleId);
				setDriveType(driveType);
				
				
	}
	
	public int getId() {
		return vehicleId;
		
	}
	
	public void setId(int Id) {
		this.vehicleId = Id;
	}
	
	public String getDriveType() {
		return driveType;
		
	}
	
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

}