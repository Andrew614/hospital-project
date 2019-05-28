package Janitors;

import models.Employee;

public class Janitor extends Employee{

	boolean isSweeping;
	
	public Janitor(String name, String employeeID, boolean isSweeping, boolean hasBeenPaid) {
		super(name, employeeID, hasBeenPaid);
		this.isSweeping = isSweeping;
		this.setSalary(40000);
	}

	public boolean isSweeping() {
		return isSweeping;
	}

	public void setSweeping(boolean isSweeping) {
		this.isSweeping = isSweeping;
	}

	@Override
	public void paySalary() {
		if(!this.getHasBeenPaid()) {
			System.out.println("Janitor " + this.getName() + " has been paid $" + this.getSalary());
			setHasBeenPaid(true);
		}
		else {
			System.out.println("Janitor " + this.getName() + " has already been paid");
		}
		
	}
}
