package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashBoard {
	public WebDriver driver;
	By addCustomer = By.xpath("//span[contains(text(),'Add Customer')]");
	By collections = By.xpath("//span[contains(text(),'Collections')]");
	By customers = By.xpath("//span[contains(text(),'Customers')]");
	By payouts = By.xpath("//span[contains(text(),'Payouts')]");
	By transfer = By.xpath("//span[contains(text(),'Transfers')]");
	By makePayment = By.xpath("//button[contains(text(),'Make a payment')]");
	

	public dashBoard(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getaddcust() {
		return driver.findElement(addCustomer);
	}
	public WebElement getCollections() {
		return driver.findElement(collections);
	}
	public WebElement getCustomer() {
		return driver.findElement(customers);
	}
	public WebElement getPayouts() {
		return driver.findElement(payouts);
	}
	public WebElement getTransfer() {
		return driver.findElement(transfer);
	}
	public WebElement getMakeaPayment() {
		return driver.findElement(makePayment);
	}
	
}
