package automation.demo;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObject.createInvoice;
import pageObject.customerPage;
import pageObject.customers;
import pageObject.payouts;
import pageObject.addCustomer;
import pageObject.dashBoard;
import pageObject.loginPage;
import pageObject.yportal;
import resources.DriverUtil;

public class signIn2  {
	
	Faker f = new Faker();
	private DriverUtil driverUtil;
	public WebDriver driver;
	private Properties properties;
	private static Logger log =LogManager.getLogger(DriverUtil.class.getName());
	
	@BeforeTest
	public void before() {
		driverUtil=DriverUtil.getInstance();
		log.info("driver initiated");
		driver=driverUtil.getDriver();
		properties = driverUtil.getProperties();
		driver.get(properties.getProperty("url"));
	}
	@Test(priority = 1)
	/**
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void test_login_Navigation() throws IOException, InterruptedException {
		
		yportal yp= new yportal(driver);
		yp.clickSignIn().click();
		//To Test_login
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys("tejesh@procureli.com");
		Thread.sleep(3000);
		lp.getPassword().sendKeys("hello");
		Thread.sleep(3000);
		lp.getsign().click();
		log.info("logged in!");
	}
		
	    @Test(priority = 2)
		public void test_Add_Customer() throws InterruptedException {
		
	    Thread.sleep(3000);
	    dashBoard db = new dashBoard(driver);
		db.getaddcust().click();
		Thread.sleep(3000);
	
		//To get all the elements from page object we have created object of addCustomer
		//To test_create_new customer
		addCustomer ac = new addCustomer(driver);
		String firstName = f.name().firstName();
		ac.getName().sendKeys(firstName);
		ac.getMobile().sendKeys("1010101010");
		ac.getEmail().sendKeys(firstName+"@procureli.com");
		ac.getSave().click();
		Thread.sleep(3000);
		log.info("Customer created");
		}
		
		@Test(priority = 3)
		public void test_create_invoice() throws InterruptedException {
		
		Thread.sleep(3000);
		dashBoard db = new dashBoard(driver);
		db.getCollections().click();

		db.getCustomer().click();
		
		Thread.sleep(5000);
		customers cus = new customers(driver);
		cus.getClcikCust().click();
		Thread.sleep(3000);
		
		customerPage cp = new customerPage(driver);
		cp.getInvoice().click();
		//To test_create_invoice
		createInvoice ci = new createInvoice(driver);
		ci.getAmount().clear();
		ci.getAmount().sendKeys("1");
		ci.getSendInvoice().click();
		log.info("Invoice created");
		}
		@Test(priority = 4)
		public void test_Make_A_Payment() throws InterruptedException {
			
			dashBoard db = new dashBoard(driver);
			db.getPayouts().click();
			db.getTransfer().click();
			db.getMakeaPayment().click();
			//To test_payouts/Transfers
			payouts p = new payouts(driver);
		    p.getDropdown().click();
		    p.getBene().sendKeys("Arveen");
		    p.getBene().sendKeys(Keys.ENTER);
			p.getradio().click();
			
			p.getNaturePayment().click();
			p.getselectOption().click();
			Thread.sleep(2000);
			//javascript executor for performing task like scrolling
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
			js.executeScript("arguments[0].scrollIntoView();",Element );
			Thread.sleep(2000);
			p.getPurpose().click();
			Thread.sleep(2000);
			p.getOptions().click();
			p.getAmount().sendKeys("2");
			Thread.sleep(2000);
			p.getTransfer().click();
			log.info("Transfer initiated");
			
		}

	}


