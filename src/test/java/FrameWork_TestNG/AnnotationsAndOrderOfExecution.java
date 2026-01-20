package FrameWork_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
| Annotation    | Purpose                      |
| ------------- | ---------------------------- |
| @BeforeSuite  | Runs once before suite       |
| @BeforeTest   | Runs before test             |
| @BeforeClass  | Runs before class            |
| @BeforeMethod | Runs before each test method |
| @Test         | Actual test                  |
| @AfterMethod  | Runs after each test method  |
| @AfterClass   | Runs after class             |
| @AfterTest    | Runs after test              |
| @AfterSuite   | Runs once after suite        |

*In TestNG, a Suite means a collection of tests that are executed together. It's a Top level Container.
*A Test is a group of classes inside a suite.
*A Class is a Java class that contains test methods.
*A Method is an individual test case marked with @Test.

| Level  | Defined In | Contains   | Purpose                |
| ------ | ---------- | ---------- | ---------------------- |
| Suite  | testng.xml | Tests      | Full execution control |
| Test   | testng.xml | Classes    | Logical grouping       |
| Class  | Java file  | Methods    | Feature/module         |
| Method | Java file  | Test steps | Actual test            |


*Why Suite is Important?

You can:
✅ Run only smoke tests
✅ Run regression tests
✅ Run in parallel
✅ Run different browsers
✅ Control execution

XML: 
---------------------------------
<suite name="MyTestSuite">
    <test name="LoginTests">
       <classes>
            <class name="com.example.tests.LoginTest"/>
	 				<methods>
	 					<include name="testFail"/>
	 					<include name="testAssert"/>
	 				</methods>
			</class>
        </classes>
    </test>
</suite>

 */

public class AnnotationsAndOrderOfExecution {
    @BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}	
    @BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
    @BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
    @BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
    @Test
	public void actualTest() {
		System.out.println("Actual Test");
	}
    @AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
    @AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
    @AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
    @AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
