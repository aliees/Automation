package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class payouts {
	public WebDriver driver;
	By dropdown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]");
	By selectBene  = By.id("react-select-3-input");
	By radio = By.name("banktransferType");
	By naturePayment = By.name("natureofPayment");
	By selectOption = By.xpath("//option[contains(text(),'Miscellaneous')]");
	By purpose = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[13]/div[1]/select[1]");
	By options = By.xpath("//option[contains(text(),'Sales')]");
	By totalAmount = By.name("totalamount");
	By transfer = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");
	
	public payouts(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getOptions() {
		return driver.findElement(options);
	}
	public WebElement getTransfer() {
		return driver.findElement(transfer);
	}
	public WebElement getAmount() {
		return driver.findElement(totalAmount);
	}
	public WebElement getselectOption() {
		return driver.findElement(selectOption);
	}
	public WebElement getDropdown() {
		return driver.findElement(dropdown);
	}
	public WebElement getBene() {
		return driver.findElement(selectBene);
	}
	public WebElement getradio() {
		return driver.findElement(radio);
	}
	public WebElement getNaturePayment() {
		return driver.findElement(naturePayment);
	}
	public WebElement getPurpose() {
		return driver.findElement(purpose);
	}
}
