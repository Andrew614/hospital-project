package doctors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import doctors.Doctor;
import models.Patient;

public class DoctorTest {

	Doctor doctor = new Doctor("Andrew", "1", "Brain", false);
	Patient patient = new Patient("a");
	
	@Test
	public void shouldReturnTrueWhenPaid() {
		doctor.paySalary();
		assertThat(doctor.isHasBeenPaid(), is(true));
	}
	
	@Test
	public void shouldReturnHeartWhenSpecialtyIsChanged() {
		doctor.setSpecialty("Heart");
		assertThat(doctor.getSpecialty(), is("Heart"));
	}
	
	@Test
	public void shouldReturn19WhenPatientBloodIsDrawn(){
		doctor.drawBlood(patient);
		assertThat(patient.getBloodLevel(), is(19));
	}
	
	@Test
	public void shouldReturn20WhenPatientIsCaredFor() {
		doctor.careForPatient(patient);
		assertThat(patient.getHealthLevel(), is(20));
	}
	
}
