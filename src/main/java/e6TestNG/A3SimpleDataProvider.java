package e6TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A3SimpleDataProvider {

//	public static void main(String[] args) {
//		login("abc", "abc1");
//		login("bcd", "bcd1");
//	}
//	
//	public static void login(String userName, String password) {
//		System.out.println("Username"+ userName);
//		System.out.println("Password"+ password);
//	}

//	@Test(dataProvider = "NameAndOffice")
////	@Test(dataProvider = "NameAndOffice", invocationCount = 2)


	@Test(dataProvider = "NameAndOffice")
	public void login(String userName, String password) {
		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
		System.out.println("***************************");
	}

//	public void testingDataProvider(String name, String office) {
//		System.out.println("Person Name: "+name);
//		System.out.println("Office Name: "+office);
//	}

	@DataProvider
	public Object[][] NameAndOffice() {
		
//		Object[][] data1 = {
//				{"Sathya", "Aon"},
//				{"Sathiyamoorthi", "CTS"},
//				{"SathiyamoorthiM", "Capgemini"},
//				{"SathiyamoorthiMurugesan", "TCS"}
//		};

		Object[][] data = new Object[3][2];
		// 3 - represents how many times you want to run the method
		// 2 - represents no.of parameters

		data[0][0] = "Sathya";
		data[0][1] = "Aon";

		data[1][0] = "Sathiyamoorthi";
		data[1][1] = "CTS";

		data[2][0] = "SathiyamoorthiM";
		data[2][1] = "Capgemini";
		
		
		
		return data;

	}

}
