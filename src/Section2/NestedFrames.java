package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/nestedframes");
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(ele).switchTo().frame(0);
	String data=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println(data);
}
}
