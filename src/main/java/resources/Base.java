package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\David Alola\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		
		driver = new ChromeDriver();
		return driver;
	}
	
}
