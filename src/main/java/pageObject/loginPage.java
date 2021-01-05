package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	public WebDriver driver;
By username = By.name("username");
By password = By.name("password");
By signin = By.xpath("//input[@class='island-button']");


public loginPage(WebDriver driver) {
	this.driver=driver;
}

public WebElement getEmail() {
	return driver.findElement(username);
}
public WebElement getPassword() {
	return driver.findElement(password);
}
public WebElement getsign() {
	return driver.findElement(signin);
}
}
