/*
 Can you open the Multiple web application at the same time.
 Yes,we can open the multiple web application at the same time by 
 using the multiple get methods.
 */
package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebPages {
	public static void main(String[] args) throws Throwable {
		System.setProperty("https://www.youtube.com/", "C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		https://www.zomato.com/
		Thread.sleep(2000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		
		
		
	}

}
