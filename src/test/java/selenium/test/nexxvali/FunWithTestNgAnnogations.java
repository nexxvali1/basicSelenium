package selenium.test.nexxvali;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class FunWithTestNgAnnogations {

	String chromeDriver = "webdriver.chrome.driver";
	String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	public String url = "https://www.nexxvali.com";
	static String aboutUsBtnXpath = "//li[@id='menu-item-570']";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",driverLocation);
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
	public void terminateBrowser() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
}
