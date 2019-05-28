package models;

public class Patient {
	
	private String name;
	private int bloodLevel = 20;
	private int healthLevel = 10;
	
	public Patient(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public void setBloodLevel(int bloodLevel) {
		this.bloodLevel = bloodLevel;
		if(this.bloodLevel > 30) {
			this.bloodLevel = 30;
		}
		if(this.bloodLevel < 1) {
			this.bloodLevel = 1;
		}
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void setHealthLevel(int healthLevel) {
		this.healthLevel = healthLevel;
		if(this.healthLevel > 50) {
			this.healthLevel = 50;
		}
		if(this.healthLevel < 1) {
			this.healthLevel = 1;
		}
	}
	
}
