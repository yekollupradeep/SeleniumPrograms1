package Section03;

import org.testng.annotations.Test;

public class ProirtyFlag {
	@Test(priority = 3)
	public void cat()
	{
	System.out.println("cat running.");	
	}
	@Test(priority = 2)
	public void dog()
	{
		System.out.println("dog running");
	
	}
	@Test(priority = 1)
	public void monkey()
	{
	System.out.println(" Monkeys running");	
	}

}
