package selenium.test.nexxvali;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class PerformActionClass {

	// Better organize for Clean Code
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String url = "https://www.nexxvali.com";
	static String aboutUsBtnXpath = "//li[@id='menu-item-570']";


	@Test
	public void scrollDownAndUp() throws Exception {
		System.setProperty(chromeDriver, driverLocation);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		
		//The constructor of the Action class takes a param. Here we will pass the driver
		//In this case the Action class object 'action' will use the driver
		Actions action = new Actions(driver);
		
		
		action.moveToElement(driver.findElement(By.xpath(aboutUsBtnXpath))).click();
		
			Thread.sleep(10000);
			
	
			
			
			driver.quit();
	}
	

}
