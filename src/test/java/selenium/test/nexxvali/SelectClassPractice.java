package selenium.test.nexxvali;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.*;

public class SelectClassPractice {

	// Better organize for Clean Code
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String url = "https://www.mycontactform.com/samples/businesscontact.php";
	static String emailXpath = "//input[@id='email']";
	static String emailInput = "mukit@nexxvali.com";
	static String ssLocation = "/Users/Mukit/Documents/workspace/nexxvali/screenShots/TestSS.jpeg";

	@Test
	public void businesscontact() throws Exception {
		System.setProperty(chromeDriver, driverLocation);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		driver.findElement(By.xpath(emailXpath)).sendKeys(emailInput);

	
			Thread.sleep(3000);
			
			//What is Typecasting. Forcefully use something which is not mean to be used for.
			int x = (int) 5.5;
			/*You can't create object of an Interface, you can create object of a class. 
			Through type casting we are forcefully creating object of an Interface. Here we have
			created object 'ss' from TakesScreenshot interface by typecasting with the 'driver' object.
			In this way the driver can be used by the Interface*/
			
			TakesScreenshot ss = (TakesScreenshot) driver;
			
			//Get a file from source and put it in a folder location
			//2 param: 1) What is the source file 2)Where to keep
			FileUtils.copyFile(ss.getScreenshotAs(OutputType.FILE), new File(ssLocation));

			Thread.sleep(3000);
	
			driver.quit();

	}

}
