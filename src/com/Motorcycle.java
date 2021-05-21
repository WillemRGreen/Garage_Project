package com;

public class Motorcycle extends Vehicle {
	
	protected String engineType;
	
	public Motorcycle(
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
				setEngineType(engineType);
				
				
	}
	
	public String getEngineType() {
		return engineType;
		
	}
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
