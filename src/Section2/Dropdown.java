package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("yekollupradeep");
		driver.findElement(By.id("input-firstname")).sendKeys("yekollu");
		driver.findElement(By.id("input-lastname")).sendKeys("pradeep");
		driver.findElement(By.id("input-email")).sendKeys("pradeepyekollu123@gmail.com");
		WebElement ele=driver.findElement(By.id("input-country"));
		Select sc=new Select(ele);
		sc.selectByIndex(13);
	//sc.selectByVisibleText("india");
		
		
		
	}

}
