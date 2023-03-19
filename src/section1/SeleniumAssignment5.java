package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment5 {

		public static void main(String[] args) throws Throwable {
			System.setProperty("https://www.youtube.com/", "C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/selenium/newtours/register.php");
			driver.manage().window().maximize();
			driver.findElement(By.name("lastName")).sendKeys("pradeep");
			driver.findElement(By.cssSelector("phone")).sendKeys("9440506374");
			
			
	}

}
