package TestDeamon.Tinah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver; 
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	By logo = By.id("logo"); 
	By aboutMenu = By.cssSelector("#top-menu #menu-item-267"); 
	By aboutRCCG = By.cssSelector("#top-menu #menu-item-1898"); 
	
	public WebElement getLogo() {
		return driver.findElement(logo);	
	}
	
	public WebElement getAboutMenu() {
		return driver.findElement(aboutMenu);
	}
	
	public AboutRCCG getAboutRCCG() {
		driver.findElement(aboutRCCG).click();
		return new AboutRCCG(driver);
	}
		
}
