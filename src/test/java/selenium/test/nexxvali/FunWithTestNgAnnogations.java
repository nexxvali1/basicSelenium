package selenium.test.nexxvali;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertNotSame;

import java.util.concurrent.TimeUnit;

public class FunWithTestNgAnnogations {

	String chromeDriver = "webdriver.chrome.driver";
	String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	public String url = "https://www.nexxvali.com";
	static String aboutUsBtnXpath = "//li[@id='menu-item-570']";
	//Here we have decleared the driver
	public WebDriver driver;

	@BeforeTest
	//Any generic code that can be used in all the tests
	public void launchBrowser() {
		System.setProperty(chromeDriver,driverLocation);
		//Here we have assigned/initialized the driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test
	public void clickOnAboutUs() {
		driver.findElement(By.xpath(aboutUsBtnXpath)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String actAbtUsPgTitle = driver.getTitle();
		String expAbtUsPgTitle = "About Us – Nexxvali";
		Assert.assertEquals(actAbtUsPgTitle, expAbtUsPgTitle);
	}

	@AfterTest
	//Any code that can be used after all the tests are completed
	public void terminateBrowser() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
}
