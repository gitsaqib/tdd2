package tdd2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WasRunTest {

	@Test
	public void testWasRunCalled() {
		WasRun wasRun=new WasRun("testMethod");
		assertFalse(wasRun.wasRun());
		wasRun.run();
		assertTrue(wasRun.wasRun());
	}

}
