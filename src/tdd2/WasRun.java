package tdd2;

public class WasRun extends TestCase
{
	private boolean wasRun;
	public WasRun(String name) {
		super(name);
	}
	public boolean wasRun() {
		return wasRun;
	}
	public void testMethod()
	{
		this.wasRun=true;
	}

}