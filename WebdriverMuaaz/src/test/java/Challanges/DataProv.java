package Challanges;

import org.testng.annotations.DataProvider;

public class DataProv {
	
	@org.testng.annotations.Test(dataProvider = "DataSet") // calling from method
	public void Test(String username,String password) {
		System.out.println(username +" +++"+ password);
	}
	
	
	@org.testng.annotations.Test(dataProvider = "fromName") // calling from dataprovider name
	public void Test1(String username,String password) {
		System.out.println(username +" +++"+ password);
	}
	
	
	@DataProvider(name="fromName")
	public Object[][] DataSet1(){
		
		return new Object[][] {
							  {"username","password"},
							  {"username1","password1"},
							  {"username2","password2"}};
	}
	
	@DataProvider
	public Object[][] DataSet() {
		
		Object[][] dataset = new Object[4][2];
		
		//first row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";
		
		//second row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";
		
		//third row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";

		//fourth row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";
		
		return dataset;
	
	}

	

}
