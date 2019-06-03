package receptionists;

import models.Employee;

public class Receptionist extends Employee {
	
	private boolean occupiedOnPhone = false;

	public Receptionist(String name, String employeeID, boolean occupiedOnPhone, boolean hasBeenPaid) {
		super(name, employeeID, hasBeenPaid);
		this.setOccupiedOnPhone(occupiedOnPhone);
		this.setSalary(45000);
	}

	public boolean getOccupiedOnPhone() {
		return occupiedOnPhone;
	}

	public void setOccupiedOnPhone(boolean occupiedOnPhone) {
		this.occupiedOnPhone = occupiedOnPhone;
	}
	
	@Override
	public void paySalary() {
		if(!this.getHasBeenPaid()) {
			System.out.println("Receptionist " + this.getName() + " has been paid $" + this.getSalary());
			this.setHasBeenPaid(true);
		}
		else {
			System.out.println("Receptionist " + this.getName() + " has already been paid");
		}
	}
	
	@Override
	public String toString() {
		return "Receptionist " + this.getName() + ", Employee ID # " + this.getEmployeeID() + ", has a salary of $" + this.getSalary() + " a year.";
	}
}
