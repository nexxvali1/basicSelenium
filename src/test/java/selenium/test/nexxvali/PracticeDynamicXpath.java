package selenium.test.nexxvali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PracticeDynamicXpath {
	
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String url = "https://www.mycontactform.com/samples/businesscontact.php";
	static String listRadioBtnXpath = "//input[@type='radio']";
	
	
	@Test
	public void testDynamicXpath() throws Exception {
		
		System.setProperty(chromeDriver, driverLocation);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		
		List<WebElement> allRadioBtn = driver.findElements(By.xpath(listRadioBtnXpath));
		
		for (int i=0; i<allRadioBtn.size(); i++) {
			
			WebElement specificRadioBtn = allRadioBtn.get(i);
			
			String value = specificRadioBtn.getAttribute("value");
			
			if (value.equalsIgnoreCase("Morning")) {
				
				specificRadioBtn.click();
				
			}
			
		}
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
