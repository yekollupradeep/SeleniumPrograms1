package Section03;

import org.testng.annotations.Test;

public class DependsOnmethosFlag {
	@Test(dependsOnGroups = "login")
	public void homepage()
	{
		System.out.println(" home page is displayed");
		
	}
@Test
public void login()
{
	System.out.println(" login page is displayed");

}
@Test
public void url()

{
	System.out.println(" login is displayed.");
	
}
}
