package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yportal {
	public WebDriver driver;
By sign = By.xpath("//header/nav[@id='navbar-main']/div[1]/a[2]");

public yportal(WebDriver driver) {
	this.driver=driver;
}

public WebElement clickSignIn() {
	return driver.findElement(sign);
}
}

