package models;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import models.Patient;

public class PatientTest {

	Patient patient = new Patient("John");
	
	@Test
	public void shouldHaveNameOfJohn() {
		assertThat(patient.getName(), is("John"));
	}
	
	@Test
	public void shouldHaveBloodAndHealthLevelOf20And10() {
		assertThat(patient.getBloodLevel(), is(20));
		assertThat(patient.getHealthLevel(), is(10));
	}
	
	@Test
	public void shouldHaveBloodLevelOf30() {
		patient.setBloodLevel(51);
		assertThat(patient.getBloodLevel(), is(30));
	}
	
	@Test
	public void shouldHaveBloodLevelOf1() {
		patient.setBloodLevel(0);
		assertThat(patient.getBloodLevel(), is(1));
	}
	
	@Test
	public void shouldHaveHealthLevelOf51() {
		patient.setHealthLevel(51);
		assertThat(patient.getHealthLevel(), is(50));
	}
	
	@Test
	public void shouldHaveHealthLevelOf1() {
		patient.setHealthLevel(0);
		assertThat(patient.getHealthLevel(), is(1));
	}
	
}
