package AssignmentSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3002 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		int count=0;
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(text(),\"APPLE iPhone\")]"));
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
//		List<WebElement> mulele=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li/li"));
//		for(WebElement ele:mulele)
//		{
//			String data=ele.getText();
//			System.out.println(data);
//			count++;
//		}
//		System.out.println(count);
	}

}