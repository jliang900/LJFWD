/**
 * 
 */
package com.apress.decoupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jliang
 *
 */
public class VehicleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext(
                "beans.xml");
		VehicleService vehicleService = (VehicleService) context
                .getBean("vehicleService");
		vehicleService.drive();
		((ClassPathXmlApplicationContext)context).close();
	}

}
