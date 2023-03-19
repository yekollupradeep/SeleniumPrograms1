package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizeBrowser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.prokabaddi.com/");
		Dimension d= new Dimension(600,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p= new Point(200,500);
		driver.manage().window().setPosition(p);
		
	}

}
