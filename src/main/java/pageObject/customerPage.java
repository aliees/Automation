package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customerPage {
	public WebDriver driver;
 By clickInvoice = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/button[1]");
 
 public customerPage(WebDriver driver) {
	 this.driver=driver;
}

public WebElement getInvoice() {
	 return driver.findElement(clickInvoice);
 }
}
