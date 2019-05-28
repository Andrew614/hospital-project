package Janitors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class JanitorTest {
	
	Janitor janitor = new Janitor("Brian", "4", true, false);
	
	@Test
	public void shouldReturnTrueWhenPaid() {
		janitor.paySalary();
		assertThat(janitor.getHasBeenPaid(), is(true));
	}
	
	@Test
	public void shouldReturnTrueIfJanitorIsSweeping() {
		assertThat(janitor.isSweeping(), is(true));
	}

}
