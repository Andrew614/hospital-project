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
			System.out.println(employee.getName() + ", Employee ID # " + employee.getEmployeeID() + ", has a salary of $" + employee.getSalary() + " a year");
		}
	}
}
