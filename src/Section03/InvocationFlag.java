package Section03;

import org.testng.annotations.Test;

public class InvocationFlag {
	@Test(invocationCount = 3)
	public void job()
	{
		System.out.println("After hardwork in life job will be coming. .");
	}
@Test
public void hardwork()
{
	System.out.println("After the hardwork in life .");
}
}
