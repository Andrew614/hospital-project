package nurses;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import models.Patient;

public class NurseTest {

	Nurse nurse = new Nurse("Jackie", "2", 10, false);
	Patient patient = new Patient("b");
	
	@Test
	public void shouldReturnTrueWhenPaid() {
		nurse.paySalary();
		assertThat(nurse.getHasBeenPaid(), is(true));
	}
	
	@Test
	public void shouldReturn15When5NewPatientsAreAdded() {
		nurse.setNumOfPatients(nurse.getNumOfPatients() + 5);
		assertThat(nurse.getNumOfPatients(), is(15));
	}
	
	@Test
	public void shouldReturn18WhenPatientBloodIsDrawn(){
		nurse.drawBlood(patient);
		assertThat(patient.getBloodLevel(), is(18));
	}
	
	@Test
	public void shouldReturn15WhenPatientIsCaredFor() {
		nurse.careForPatient(patient);
		assertThat(patient.getHealthLevel(), is(15));
	}
}
