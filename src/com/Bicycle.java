package com;

public class Bicycle extends Vehicle {
	
	protected int vehicleId;
	protected String gearType;
	protected String vehicleType = "bicycle";
	
	public Bicycle(
			String make, 
			String model, 
			int miles, 
			Boolean running, 
			int year, 
			int vehicleID, 
			String gearType) 
	{
		
				super(make, model, miles, running, year);
				setId(vehicleId);
				setGearType(gearType);
				
				
	}
	
	public int getId() {
		return vehicleId;
	}
	
	public void setId(int Id) {
		this.vehicleId = Id;
	}
	
	public String getGearType() {
		return gearType;
	}
	
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

}