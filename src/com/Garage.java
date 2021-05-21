package com;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	protected Boolean full = false;
	protected List<Object> vehicleList = new ArrayList<Object>();
	
	public Garage(Boolean full) {
		this.full = full;
	}
	
	public int billCalc() {
		
		int totalBill = 0;
		for(int i = 0; i < vehicleList.size(); i++) {
			if(Vehicle.getVehicleType().equals("bicycle")){
				totalBill += 500;
			} else if(Vehicle.getVehicleType().equals("motorcycle")) {
				totalBill += 5000;
			} else if(Vehicle.getVehicleType().equals("car")) {
				totalBill += 10000;
			}
		}
		return totalBill;
	}
	
	public void addVehicle(Object vehicle) {
		vehicleList.add(0, vehicle);
		
	}
	
	public void removeVehicle(int vehicleId) {
		for(int i = 0; i < vehicleList.size(); i++) {
			if(Vehicle.getId() == vehicleId) {
				vehicleList.remove(i);
			}
		}
	}
	
	public void empty() {
		for(int i = 0; i < vehicleList.size(); i++) {
			vehicleList.remove(vehicleList.get(i));
		}
	}
}