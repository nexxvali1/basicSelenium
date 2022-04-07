package selenium.test.nexxvali;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.ArrayList;


public class PlayWithDropDownMenu {
	
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String url = "https://www.mycontactform.com/samples/businesscontact.php";
	static String stateDdXpath = "//select[@name='q[12]']";
	
	@Test
	public void compareDropDownMenu() throws Exception {
		
		System.setProperty(chromeDriver, driverLocation);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		
		Select states = new Select(driver.findElement(By.xpath(stateDdXpath)));
		
		List stateToStore = new ArrayList();
		
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
	
}
