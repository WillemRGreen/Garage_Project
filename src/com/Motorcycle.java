package com;

public class Motorcycle extends Vehicle {
	
	protected int vehicleId;
	protected String engineType;
	protected String vehicleType = "motorcycle";
	
	public Motorcycle(
			String make, 
			String model, 
			int miles, 
			Boolean running, 
			int year, 
			int vehicleID, 
			String engineType) 
	{
		
				super(make, model, miles, running, year);
				setId(vehicleId);
				setEngineType(engineType);
				
				
	}
	
	public int getId() {
		return vehicleId;
		
	}
	
	public void setId(int Id) {
		this.vehicleId = Id;
	}
	
	public String getEngineType() {
		return engineType;
		
	}
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
