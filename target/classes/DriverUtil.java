package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverUtil {
	private WebDriver driver;
	private Properties prop;
	private static  DriverUtil instance;
	
	public WebDriver getDriver() {
		return driver;
	}
	public Properties getProperties() {
		return prop;
	}
private DriverUtil () {
		
	}
	public static DriverUtil getInstance() {
		if(instance == null) {
			instance = new DriverUtil();
		try {
			instance.initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return instance;
	}
//method for driver Initialization
	public WebDriver initializeDriver() throws IOException
	{
		
	prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\aliee\\jav\\demo\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
    driver=getDriver(browserName);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;

}
	//method for taking screenshot

	public String getScreenShotPath(String testCaseName , WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\report\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
	//browser selection logic
	public WebDriver getDriver(String browserName) {
		if(browserName.equals("chrome" ))
		{
			 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		     return new ChromeDriver();
				//execute in chrome driver
			
		}
		else if (browserName.equals("firefox"))
		{
			 return new FirefoxDriver();
			//firefox code
		}
		return null;
	}
}
