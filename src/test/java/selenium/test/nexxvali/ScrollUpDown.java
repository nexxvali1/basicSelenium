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

public class ScrollUpDown {

	// Better organize for Clean Code
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String url = "https://www.nexxvali.com";
	static String nexxYtBtnXpath = "//a[@aria-label='YouTube']";

	@Test
	public void scrollDownAndUp() throws Exception {
		System.setProperty(chromeDriver, driverLocation);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)", "");

		js.executeScript("window.scrollBy(0,350)", "");

		js.executeScript("window.scrollBy(0,350)", "");
		
		js.executeScript("window.scrollBy(0,350)", "");

		js.executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-350)", "");

		js.executeScript("window.scrollBy(0,-350)", "");

		js.executeScript("window.scrollBy(0,-350)", "");
		
		js.executeScript("window.scrollBy(0,-350)", "");

		Thread.sleep(3000);

		driver.quit();
	}

	// @Test
	public void scrollUntilElement() throws Exception {
		System.setProperty(chromeDriver, driverLocation);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(3000);

		WebElement nexxYtBtn = driver.findElement(By.xpath(nexxYtBtnXpath));
		WebElement servicesBtn = driver.findElement(By.linkText("Services Details"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", servicesBtn);

		Thread.sleep(3000);

		driver.quit();

	}

}
