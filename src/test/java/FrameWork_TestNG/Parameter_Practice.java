package FrameWork_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*
 * Parameters in TestNG are used to pass values from testng.xml to your test methods.
 
| Parameters    | DataProvider        |
| ------------- | ------------------- |
| Static data   | Dynamic data        |
| From XML      | From code           |
| Runs once     | Runs multiple times |
| Simple values | Multiple datasets   |

 */
public class Parameter_Practice {
	
	@Parameters({"name", "id", "exp"})
	@Test 
	public void employeeDetails(String name, int id, int exp) {
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee ID: "+ id);
		System.out.println("Experience: "+ exp);
	}

}
