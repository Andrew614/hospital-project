package applications;

import doctors.Doctor;
import models.Employee;

public class Application {

	public static void main(String[] args) {
		Employee doc = new Doctor("Andrew", "1", "Brain", false);
		System.out.println(doc.getSalary());
		doc.paySalary();

	}

}
