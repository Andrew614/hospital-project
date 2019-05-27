package doctors;

import interfaces.MedicalEmployee;
import models.Employee;
import models.Patient;

public class Doctor extends Employee implements MedicalEmployee {
	
	private String specialty;
	
	public Doctor(String name, String employeeID, String specialty, boolean hasBeenPaid) {
		super(name, employeeID, hasBeenPaid);
		this.specialty = specialty;
		salary = 90000;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	@Override
	public void paySalary() {
		if(!hasBeenPaid) {
			System.out.println("Doctor " + name + " has been paid $" + salary);
			hasBeenPaid = true;
		}
		else {
			System.out.println("Doctor " + name + " has already been paid");
		}
	}

	@Override
	public void drawBlood(Patient patient) {	
		patient.setBloodLevel(patient.getBloodLevel() - 1);
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.setHealthLevel(patient.getHealthLevel() + 10);
	}

}
