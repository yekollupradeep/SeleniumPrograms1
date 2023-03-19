/*
How fecth the Title of webPage.
*/
package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlefetch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yekol\\eclipse-workspace\\Selenium01\\server\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String Title= driver.getTitle();
		System.out.println(Title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
	}

}
