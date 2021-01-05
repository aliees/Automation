package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customers {
	public WebDriver driver;
By clickCustomer = By.xpath("//tbody/tr[1]/td[1]");



public customers(WebDriver driver) {
	this.driver=driver;
}

public WebElement getClcikCust() {
	return driver.findElement(clickCustomer);
}
}