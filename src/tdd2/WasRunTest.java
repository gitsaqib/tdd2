package tdd2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WasRunTest {

	@Test
	public void testWasRunCalled() {
		WasRun wasRun=new WasRun();
		wasRun.testMethod();
		assertEquals(true, wasRun.wasRun());
	}

}
