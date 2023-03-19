package section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3001 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		int count=0;
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TSHIRTS");
		Thread.sleep(3000);
		
		List<WebElement> mulele =driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div"));
		for( WebElement ele:mulele)
		{
			String data =ele.getText();
			
			System.out.println(data);
			count++;
			
		
		}
		System.out.println(count);
		
		
		
		
	}

}
