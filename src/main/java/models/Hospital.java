package models;

import java.util.HashMap;

public class Hospital {
	
	private HashMap<String, Employee> employeeData = new HashMap<String, Employee>();
	
	public void addEmployee(Employee employee) {
		employeeData.put(employee.getEmployeeID(), employee);
	}
}
