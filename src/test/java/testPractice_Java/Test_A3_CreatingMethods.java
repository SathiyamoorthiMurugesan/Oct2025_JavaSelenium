package testPractice_Java;

//Syntax: AccessModifer returnType methodName() { }
//We cannot use same method name inside a class 
//Duplicate method name is not possible within a same class

public class Test_A3_CreatingMethods {
	
	public void buyBook() {
		
	}

	private void buyBook2() {
		
	}
	
	void buyBook3() {
		
	}
	
	protected void buyBook4() {
		
	}
}

//But we can use the same method name in different class

class Test_Method {
	public void buyBook() {
		
	}
}