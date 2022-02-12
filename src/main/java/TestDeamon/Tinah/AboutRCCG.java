package TestDeamon.Tinah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutRCCG {
	public WebDriver driver;

	public AboutRCCG(WebDriver driver) {
		this.driver = driver;
	}

	By aboutMenu = By.cssSelector("#top-menu #menu-item-267"); 
	By aboutMarantha = By.cssSelector(".nav .sub-menu #menu-item-1901 a"); 
	By sermons = By.cssSelector(".nav li#menu-item-1721 a");
	public WebElement getAboutMenu() {
		return driver.findElement(aboutMenu);
	}
	
	public void getAboutMaranatha() throws InterruptedException {
		driver.findElement(aboutMarantha).click();
		Thread.sleep(5000);
	}
	
	public String verifyLandingMarantha() {
		return driver.findElement(By.cssSelector(".et_pb_text_inner h1 strong")).getAttribute("innerText");
	}
	
	public void clickSermons() {
		driver.findElement(sermons).click();
	}
}
