package TestDeamon.Tinah;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TestHomepage extends Base {
	public WebDriver driver;

	@BeforeTest
	public void initalizeChrome() {
		driver = initializeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.manage().window().maximize();
		driver.get("https://www.rccgmaranatha.com.ng/");
	}

	@Test
	public void setup() throws InterruptedException {
		Actions action = new Actions(driver);
		Homepage hp = new Homepage(driver);

		action.moveToElement(hp.getAboutMenu()).build().perform();

		Thread.sleep(2000);

		AboutRCCG arg = hp.getAboutRCCG();

		Thread.sleep(3000);

		action.moveToElement(hp.getAboutMenu()).build().perform();

		arg.getAboutMaranatha();
		Thread.sleep(3000);

		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.rccgmaranatha.com.ng/about-rccg-2/")) {
			System.out.println("Landed successfully");
		}else {
			System.out.println("Page not found!");
		}

		arg.clickSermons();

		Thread.sleep(5000);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
