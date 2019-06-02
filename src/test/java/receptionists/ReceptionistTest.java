package receptionists;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import receptionists.Receptionist;

public class ReceptionistTest {
	
	Receptionist receptionist = new Receptionist("Jen", "3", true, false);
	
	@Test
	public void shouldReturnTrueWhenPaid() {
		receptionist.paySalary();
		assertThat(receptionist.getHasBeenPaid(), is(true));
	}
	
	@Test
	public void shouldReturnTrueIfReceptionistIsOnPhone() {
		assertThat(receptionist.getOccupiedOnPhone(), is(true));
	}
}
