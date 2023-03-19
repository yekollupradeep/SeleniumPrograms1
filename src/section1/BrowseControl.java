package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseControl {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdiver.chrome.driver","C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(3000);
	driver.get("https://www.prokabaddi.com/");
	driver.manage().window().maximize();
	
}
}
