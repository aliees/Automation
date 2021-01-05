package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createInvoice {
	public WebDriver driver;
	By amount = By.name("amount");
	By sendInvoice = By.xpath("//button[contains(text(),'Send Invoice')]");
	
	public createInvoice(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getAmount() {
		return driver.findElement(amount);
	}
	
	public WebElement getSendInvoice() {
		return driver.findElement(sendInvoice);
	}
}
