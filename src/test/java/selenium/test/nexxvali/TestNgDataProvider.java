package selenium.test.nexxvali;

import org.testng.annotations.*;

public class TestNgDataProvider {
	
	@DataProvider(name ="logInData")
	public Object[][] getLogInData(){
		
		Object[][] data = {
				
				{"ABC1", "Fksdjf@@#"},
				{"ABC2", "Fksee$$@#"},
				{"ABC3", "RRkDDee$$@#"},
				{"ABC3", "RRkDDee$$@#"}
		};
		return data;
	}
	
	@Test(dataProvider = "logInData")
	public void printData(String userName, String passWord){
		
		System.out.println(userName+"--------"+passWord);
		
	}

}
