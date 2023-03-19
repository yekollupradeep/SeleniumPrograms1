package section1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class Refresh {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.prokabaddi.com/");
		Thread.sleep(3000);
		driver.get("https://en.wikipedia.org/wiki/Pardeep_Narwal");
		Thread.sleep(3000);
		driver.get("https://en.wikipedia.org/wiki/Pradeep_Machiraju");
		Thread.sleep(3000);
	
		
		
	}

}
