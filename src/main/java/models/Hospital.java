package models;

import java.util.HashMap;

public class Hospital {
	
	private HashMap<String, Employee> employeeData = new HashMap<String, Employee>();
	private HashMap<String, Patient> patientData = new HashMap<String, Patient>();
	
	public void addEmployee(Employee employee) {
		employeeData.put(employee.getEmployeeID(), employee);
	}
	
	public void addPatient(Patient patient) {
		patientData.put(patient.getName(), patient);
	}
	

	public int getNumEmployees() {
		return employeeData.size();
	}

	public int getNumPatients() {
		return patientData.size();
	}
	
	public void printEmployeeData() {
		for(Employee employee: employeeData.values()) {
			System.out.println(employee.name + ", employee ID: " + employee.getEmployeeID() + " is a getting paid " + employee.getSalary() );
		}
	}
}
