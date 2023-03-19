package Section2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpMethod2 {
	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.actitime.com/");
		Set<String> allID=driver.getWindowHandles();
		for(String i:allID)
		{
			String title=driver.switchTo().window(i).getTitle();
			{
				if(title.contains("login"))
				{
					break;
				}
			}
			
		}
	}

}
