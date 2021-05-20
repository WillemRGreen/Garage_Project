package com;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	protected Boolean full;
	protected List<Object> vehicleList = new ArrayList<Object>();
	
	public Garage(Boolean full) {
		
		this.full = full;
		
	}
	
	public void billCalc() {
		
	}
	
	public void addVehicle(Object vehicle) {
		vehicleList.add(0, vehicle);
		
	}
	
	public void removeVehicle(int vehicleId) {
		
		for(int i = 0; i < vehicleList.size(); i++) {
			
			Object vehicle = vehicleList.get(i);
			
			if(vehicle.vehicleId.equals(vehicleId)) {
				vehicleList.remove(i);
			}
		}
	}
	
	public void empty() {
		
	}

}