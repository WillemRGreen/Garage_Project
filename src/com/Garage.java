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
			if(vehicleList.get(i).vehicleType.equals("bicycle")){
				totalBill += 500;
			} else if(vehicleList.get(i).vehicleType.equals("motorcycle")) {
				totalBill += 5000;
			} else if(vehicleList.get(i).vehicleType.equals("car")) {
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
			Object vehicle = vehicleList.get(i);
			if(vehicle.vehicleId.equals(vehicleId)) {
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