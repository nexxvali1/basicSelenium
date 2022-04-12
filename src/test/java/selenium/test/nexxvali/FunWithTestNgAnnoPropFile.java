package selenium.test.nexxvali;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FunWithTestNgAnnoPropFile {

	static String propFileLoc = "target/Locators.properties";
	public WebDriver driver;
	public Properties prop;

	@BeforeTest
	public void launchBrowser() throws Exception {
		InputStream input = new FileInputStream(propFileLoc);
		prop = new Properties();
		prop.load(input);

		System.setProperty(prop.getProperty("chromeDriver"), prop.getProperty("driverLocation"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority=1, description = "We are going to the URL")
	public void goToURL() {
		driver.get(prop.getProperty("nexxvaliURL"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority=2, description = "Clicking on About Us")
	public void clickOnAboutUs() {
		driver.findElement(By.xpath(prop.getProperty("aboutUsBtnXpath"))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String actAbtUsPgTitle = driver.getTitle();
		Assert.assertEquals(actAbtUsPgTitle, prop.getProperty("expAbtUsPgTitle"));
	}

	@AfterTest
	public void terminateBrowser() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
}
