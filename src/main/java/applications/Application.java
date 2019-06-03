package applications;

import java.util.Scanner;

import Janitors.Janitor;
import doctors.Doctor;
import models.Hospital;
import models.Patient;
import nurses.Nurse;
import receptionists.Receptionist;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hospital hospitalDataList = new Hospital();
		String employeeName, employeeID, paidAnswer;
		boolean hasBeenPaid;
		int userInput = menuAndUserInput(input);
		while(userInput != 9) {
			if(userInput == 1) {
				System.out.println("Enter \"1\" to input data for a doctor\n" + "Enter \"2\" to input data for a nurse\n" 
				+ "Enter \"3\" to input data for a receptionist\n" + "Enter \"4\" to input data for a janitor");
				userInput = Integer.parseInt(input.nextLine());
				switch(userInput) {
				
				case 1:
					System.out.println("Enter the name of the employee");
					employeeName = input.nextLine().toUpperCase();
					System.out.println("Enter the employee's ID");
					employeeID = input.nextLine();
					System.out.println("Has " + employeeName + " been paid? Yes/No");
					paidAnswer = input.nextLine().toLowerCase();
					if(paidAnswer.equals("yes")) {
						hasBeenPaid = true;
					} else {
						hasBeenPaid = false;
					}
					System.out.println("What is " + employeeName + "'s specialty?");
					String specialty = input.nextLine();
					Doctor doctor = new Doctor(employeeName, employeeID, specialty, hasBeenPaid);
					hospitalDataList.addEmployee(doctor);
					break;
					
				case 2:
					System.out.println("Enter the name of the employee");
					employeeName = input.nextLine().toUpperCase();
					System.out.println("Enter the employee's ID");
					employeeID = input.nextLine();
					System.out.println("Has " + employeeName + " been paid? Yes/No");
					paidAnswer = input.nextLine().toLowerCase();
					if(paidAnswer.equals("yes")) {
						hasBeenPaid = true;
					} else {
						hasBeenPaid = false;
					}
					System.out.println("How many patients does Nurse " + employeeName + " currently have?");
					int numOfPatients = Integer.parseInt(input.nextLine());
					Nurse nurse = new Nurse(employeeName, employeeID, numOfPatients, hasBeenPaid);
					hospitalDataList.addEmployee(nurse);
					break;
					
				case 3:
					System.out.println("Enter the name of the employee");
					employeeName = input.nextLine().toUpperCase();
					System.out.println("Enter the employee's ID");
					employeeID = input.nextLine();
					System.out.println("Has " + employeeName + " been paid? Yes/No");
					paidAnswer = input.nextLine().toLowerCase();
					if(paidAnswer.equals("yes")) {
						hasBeenPaid = true;
					} else {
						hasBeenPaid = false;
					}
					System.out.println("Is " + employeeName + " on the phone? Yes/No");
					String onPhoneAnswer = input.nextLine().toLowerCase();
					boolean onPhone;
					if(onPhoneAnswer.equals("yes")) {
						onPhone = true;
					} else {
						onPhone = false;
					}
					Receptionist receptionist = new Receptionist(employeeName, employeeID, onPhone, hasBeenPaid);
					hospitalDataList.addEmployee(receptionist);
					break;
					
				case 4:
					System.out.println("Enter the name of the employee");
					employeeName = input.nextLine().toUpperCase();
					System.out.println("Enter the employee's ID");
					employeeID = input.nextLine();
					System.out.println("Has " + employeeName + " been paid? Yes/No");
					paidAnswer = input.nextLine().toLowerCase();
					
					if(paidAnswer.equals("yes")) {
						hasBeenPaid = true;
					} else {
						hasBeenPaid = false;
					}
					
					System.out.println("Is " + employeeName + " on the phone? Yes/No");
					String sweepingAnswer = input.nextLine().toLowerCase();
					boolean sweeping;
					
					if(sweepingAnswer.equals("yes")) {
						sweeping = true;
					} else {
						sweeping = false;
					}
					
					Janitor janitor = new Janitor(employeeName, employeeID, sweeping, hasBeenPaid);
					hospitalDataList.addEmployee(janitor);
				}
				userInput = menuAndUserInput(input);
			} else if(userInput == 2) {
				System.out.println("Enter the patient name:");
				String patientName = input.nextLine().toUpperCase();
				Patient patient = new Patient(patientName);
				hospitalDataList.addPatient(patient);
				userInput = menuAndUserInput(input);
			} else if(userInput == 3) {
				if(hospitalDataList.getNumEmployees() > 0) {
					hospitalDataList.payEmployees();
					userInput = menuAndUserInput(input);					
				} else {
					System.out.println("No employee info has been entered.");
					userInput = menuAndUserInput(input);
				}
			} else if(userInput == 4) {
				if(hospitalDataList.getNumPatients() <= 0) {
					System.out.println("There are currently no patients in the hospital.");
				}
				else {
					System.out.println("Enter \"1\" to have the doctor draw blood from the patient.\n Enter \"2\" to have the doctor care for the patient.");
					System.out.println("Enter \"3\" to have the nurse draw blood from the patient.\n Enter \"4\" to have the nurse care for the patient.");
					userInput = Integer.parseInt(input.nextLine());
					hospitalDataList.printPatientList();
					System.out.println("Which patient would you like to perform the task on?");
					String patientName = input.nextLine();
					
					// checks if the patient is currently a patient at the hospital
					if(hospitalDataList.isAPatient(patientName)) {
						switch(userInput) {
						case 1:
							hospitalDataList.printDoctorList();
							System.out.println("Which doctor should draw the blood?");
							String doctorName = input.nextLine();
							
						}
					} else {	
						System.out.println(patientName + " is not a current patient at the hospital.");
					}
				}
				userInput = menuAndUserInput(input);
			} else if(userInput == 5) {
				if(hospitalDataList.getNumEmployees() > 0) {
					hospitalDataList.printEmployeeData();
					userInput = menuAndUserInput(input);										
				} else {
					System.out.println("No employee info has been entered.");
					userInput = menuAndUserInput(input);
				}
			} else {
				System.out.println("That is not a valid selection");
				userInput = menuAndUserInput(input);
			}
		}
		input.close();
	}

	private static int menuAndUserInput(Scanner input) {
		int userInput;
		System.out.println("Enter \"1\" if you want to input employee data\n" + "Enter \"2\" if you want to input patient data\n" 
		+ "Enter \"3\" to pay the employees.\n" + "Enter \"4\" to have a medical employee perform a task.\n"
		+ "Enter \"5\" if you want to see the current list of employees.\n" +"Enter \"9\" to exit out of the program.");
		userInput = Integer.parseInt(input.nextLine());
		return userInput;
	}

}
