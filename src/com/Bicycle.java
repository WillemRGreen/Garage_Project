package com;

public class Bicycle extends Vehicle {
	
	protected String gearType;
	
	public Bicycle(
			int Id,
			String make, 
			String model, 
			int miles, 
			Boolean running, 
			int year, 
			String vehicleType,
			int vehicleID, 
			String engineType) 
	{
		
				super(Id, make, model, miles, running, year, vehicleType);
				setGearType(gearType);
				
				
	}
	
	public String getGearType() {
		return gearType;
		
	}
	
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

}
