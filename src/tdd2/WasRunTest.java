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
	@Test
	public void testWasUpCalled() {
		WasRun wasRun=new WasRun("testMethod");
		assertFalse(wasRun.wasRun());
		wasRun.run();
		assertTrue(wasRun.wasRun());
		
	}
	@Test
	public void testSetup() {
		WasRun test = TestCase.setUp();
		test.run();
//		assertTrue(test.wasSetUp());
	}
//		def setUp(self):
//		self.test= WasRun("testMethod")
//		def testRunning(self):
//		self.test.run()
//		assert(self.test.wasRun)
//		def testSetUp(self):
//		self.test.run()
//		assert(self.test.wasSetUp)
}
