package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPoupAssigment {
	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		//driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//span[@class=ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		act.dragAndDropBy(ele, 300, 0).perform();
		
		
		
		
		
	}

}
