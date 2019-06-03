package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import doctors.Doctor;
import nurses.Nurse;

public class HospitalTest {

	Hospital hospital = new Hospital();
	Doctor doctor = new Doctor("Andrew", "1", "Brain", false);
	Nurse nurse = new Nurse("Jackie", "2", 10, false);
	Patient patient1 = new Patient("a");
	Patient patient2 = new Patient("b");
	
	@Test
	public void shouldAddEmployeeToEmployeeList() {
		hospital.addEmployee(doctor);
		assertThat(hospital.getNumEmployees(), is(1));
	}
	
	@Test
	public void shouldAddTwoEmployeesToEmployeeList() {
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		assertThat(hospital.getNumEmployees(), is(2));
	}
	
	@Test
	public void shouldAddPatientToPatientList() {
		hospital.addPatient(patient1);
		assertThat(hospital.getNumPatients(), is(1));
	}
	
	@Test
	public void shouldAdd2PatientsToPatientList() {
		hospital.addPatient(patient1);
		hospital.addPatient(patient2);
		assertThat(hospital.getNumPatients(), is(2));
	}
	
	@Test
	public void shouldReturnTrueIfAndrewIsADoctorAtHospital() {
		hospital.addEmployee(doctor);
		assertThat(hospital.isADoctor("Andrew"), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfAndrewIsNotADoctorAtHospital() {
		hospital.addEmployee(nurse);
		assertThat(hospital.isADoctor("Andrew"), is(false));
	}
	
	@Test
	public void shouldReturnTrueIfaIsAPatientAtHospital() {
		hospital.addPatient(patient1);
		assertThat(hospital.isAPatient("a"), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfaIsNotAPatientAtHospital() {
		hospital.addPatient(patient2);
		assertThat(hospital.isAPatient("a"), is(false));
	}
}
