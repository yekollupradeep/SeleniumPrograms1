package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockAssignmnet1 {
	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("sampleHeading"));
	}

}
