package receptionists;

import models.Employee;

public class Receptionist extends Employee {
	
	private boolean occupiedOnPhone = false;

	public Receptionist(String name, String employeeID, boolean occupiedOnPhone, boolean hasBeenPaid) {
		super(name, employeeID, hasBeenPaid);
		this.setOccupiedOnPhone(occupiedOnPhone);
		this.salary = 45000;
	}

	public boolean getOccupiedOnPhone() {
		return occupiedOnPhone;
	}

	public void setOccupiedOnPhone(boolean occupiedOnPhone) {
		this.occupiedOnPhone = occupiedOnPhone;
	}
	
	@Override
	public void paySalary() {
		if(!hasBeenPaid) {
			System.out.println("Receptionist " + name + " has been paid $" + salary);
			hasBeenPaid = true;
		}
		else {
			System.out.println("Receptionist " + name + " has already been paid");
		}
	}
}
