package nurses;

import interfaces.MedicalEmployee;
import models.Employee;
import models.Patient;

public class Nurse extends Employee implements MedicalEmployee {

	private int numOfPatients;

	public Nurse(String name, String employeeID, int numOfPatients, boolean hasBeenPaid) {
		super(name, employeeID, hasBeenPaid);
		this.setNumOfPatients(numOfPatients);
		salary = 50000;
	}

	public int getNumOfPatients() {
		return numOfPatients;
	}

	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.setBloodLevel(patient.getBloodLevel() - 2);
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.setHealthLevel(patient.getHealthLevel() + 5);
	}

	@Override
	public void paySalary() {
		if(!hasBeenPaid) {
			System.out.println("Nurse " + name + " has been paid $" + salary);
			hasBeenPaid = true;
		}
		else {
			System.out.println("Nurse " + name + " has already been paid");
		}
	}

}
