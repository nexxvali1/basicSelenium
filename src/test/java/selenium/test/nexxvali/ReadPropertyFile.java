package selenium.test.nexxvali;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.testng.annotations.*;


public class ReadPropertyFile {
	
	static String propertyFileLocation = "target/Locators.properties";
	
	@Test
	public void locators() throws Exception{
		
		/*Step1: Locate the file*/
		InputStream input = new FileInputStream(propertyFileLocation);
		
		/*Step2: Create object of the Properties file. Its under Java.util package*/
		Properties prop = new Properties();
		
		/*Step3: Load the properties file*/
		prop.load(input);
		
		 
	}

}
