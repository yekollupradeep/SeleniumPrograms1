package Section2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpMethod1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		// it will store the single ID
		String mainID =driver.getWindowHandle();
		//it will store the multiple id
		Set<String> allID=driver.getWindowHandles();
		for(String i:allID)
		{
			if(i.equals(mainID))
			{
				driver.switchTo().window(i);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	}
	

}
