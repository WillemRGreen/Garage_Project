package com;

public class Car extends Vehicle {
	
	protected String driveType;
	protected String vehicleType = "car";
	
	public Car(
			int Id,
			String make, 
			String model, 
			int miles, 
			Boolean running, 
			int year, 
			String vehicleType,
			int vehicleID, 
			String driveType) 
	{
		
				super(Id, make, model, miles, running, year, vehicleType);
				setDriveType(driveType);
				
				
	}
	
	
	public String getDriveType() {
		return driveType;
		
	}
	
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

}