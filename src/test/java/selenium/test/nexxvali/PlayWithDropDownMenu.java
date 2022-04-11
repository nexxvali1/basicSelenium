package selenium.test.nexxvali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.ArrayList;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PlayWithDropDownMenu {

	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String url = "https://www.nexxvali.com";
	static String aboutUsXpath = "//li[@id='menu-item-570']";
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() throws Exception {
		System.setProperty(chromeDriver, driverLocation);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void clickAboutUs() throws Exception {
		
		driver.findElement(By.xpath(aboutUsXpath)).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
