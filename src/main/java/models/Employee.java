package models;

public abstract class Employee {

	private String name;
	private String employeeID;
	private int salary;
	private boolean hasBeenPaid = false;

	public Employee(String name, String employeeID, boolean hasBeenPaid) {
		this.name = name;
		this.employeeID = employeeID;
		this.hasBeenPaid = hasBeenPaid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}

	public void setHasBeenPaid(boolean hasBeenPaid) {
		this.hasBeenPaid = hasBeenPaid;
	}

	public abstract void paySalary();

}
