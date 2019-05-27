package Janitors;

import models.Employee;

public class Janitor extends Employee{

	boolean isSweeping;
	
	public Janitor(String name, String employeeID, boolean isSweeping, boolean hasBeenPaid) {
		super(name, employeeID, hasBeenPaid);
		this.isSweeping = isSweeping;
		this.salary = 40000;
	}

	public boolean isSweeping() {
		return isSweeping;
	}

	public void setSweeping(boolean isSweeping) {
		this.isSweeping = isSweeping;
	}

	@Override
	public void paySalary() {
		if(!hasBeenPaid) {
			System.out.println("Janitor " + name + " has been paid $" + salary);
			hasBeenPaid = true;
		}
		else {
			System.out.println("Janitor " + name + " has already been paid");
		}
		
	}
}
