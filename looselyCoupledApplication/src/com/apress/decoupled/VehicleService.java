/**
 * 
 */
package com.apress.decoupled;

/**
 * @author jliang
 *
 */
public class VehicleService {
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void drive(){
		System.out.println(vehicle.drive());
	}
}
