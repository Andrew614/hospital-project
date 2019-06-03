package models;

import java.util.HashMap;

import doctors.Doctor;
import nurses.Nurse;

public class Hospital {
	
	private HashMap<String, Employee> employeeData = new HashMap<String, Employee>();
	private HashMap<String, Patient> patientData = new HashMap<String, Patient>();
	
	public void addEmployee(Employee employee) {
		employeeData.put(employee.getName(), employee);
	}
	
	public void addPatient(Patient patient) {
		patientData.put(patient.getName(), patient);
	}
	
	public int getNumEmployees() {
		return employeeData.size();
	}
	
	public Patient getPatient(String name) {
		return patientData.get(name);
	}

	public int getNumPatients() {
		return patientData.size();
	}
	
	public void payEmployees() {
		for(Employee employee: employeeData.values()) {
			employee.paySalary();
		}
	}
	
	public void printEmployeeData() {
		for(Employee employee: employeeData.values()) {
			System.out.println(employee);
		}
	}
	
	public void printPatientList() {
		for(Patient patient: patientData.values()) {
			System.out.println(patient.getName());
		}
	}
	
	public void printDoctorList() {
		for(Employee employee: employeeData.values()) {
			if(employee instanceof Doctor) {
				System.out.println(employee.getName());
			}
		}
	}
	
	public void printNurseList() {
		for(Employee employee: employeeData.values()) {
			if(employee instanceof Nurse) {
				System.out.println(employee.getName());
			}
		}
	}
	
	public boolean isAPatient(String name) {
		return patientData.containsKey(name);
	}
	
	public boolean isADoctor(String name) {
		return employeeData.containsKey(name);
	}
}
