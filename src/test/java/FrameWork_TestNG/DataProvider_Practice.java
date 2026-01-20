package FrameWork_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * DataProvider is a feature in TestNG that allows you to run the same test multiple times with different sets of data.
 * Instead of writing multiple test cases, you write one test and supply multiple inputs.
 */

public class DataProvider_Practice {

	@Test(dataProvider="userLoginDetails")
	public void login(String userName, int password) {
		System.out.println("UserName: "+userName);
		System.out.println("Password: "+password);
		System.out.println("----------------------");
	}
	
	@DataProvider
	

	public Object[][] userLoginDetails(){
		Object[][] user = new Object[4][2];
		
		user[0][0] = "mpradeepa000@gmail.com";
		user[0][1] = 2945;
		
		user[1][0] = "monika23@gmail.com";
		user[1][1] = 5623;
		
		user[2][0] = "nandhini030@gmail.com";
		user[2][1] = 6391;
		
		user[3][0] = "surya45@gmail.com";
		user[3][1] = 4957;
		
		return user;
		
	}
}
