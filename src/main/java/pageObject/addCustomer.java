package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addCustomer {
	public WebDriver driver;
	By name = By.name("name");
	By mobile = By.name("mobile");
	By email = By.name("email");
	By save = By.xpath("//button[contains(text(),'Save')]");
	
	
	public addCustomer(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getMobile() {
		return driver.findElement(mobile);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getSave() {
		return driver.findElement(save);
	}

}
