package b6Overriding;

public class A2OverridingPractice extends Parent {
	
//	RemoteWebDriver
	
	public static void main(String[] args) {
		
//		Creating object for the child class by keeping child class as a reference
		A2OverridingPractice obj = new A2OverridingPractice();
//		called  child class methods
		obj.buySoap();
		obj.buyChocolate();
		obj.buyTV("Onida");
//		called parent class methods 
		obj.buyRice();
		obj.buyTV(1000);
		
//		Creating object for the parent class by keeping parent class as a reference
		Parent obj1 = new Parent();
//		called parent class methods
		obj1.buySoap();
		obj1.buyRice();
		obj1.buyTV(100);
		
//		Creating object for the child class by keeping parent class as a reference
		Parent obj2 = new A2OverridingPractice();
//		called parent class methods
		
		System.out.println("Overriding ***************");
//		This is called overriding. Here we create Object for child with parent as Reference. 
//		We expect parent class's buySoap() method to run but during run time, JVM will pick child class buySoap() method
		obj2.buySoap(); 
		
		
		obj2.buyRice();
		obj2.buyTV(100);
		
	}


//	Overriding method
	public void buySoap() {
		System.out.println("Buy Lux soap");
	}
	
	public void buyChocolate() {
		System.out.println("Buy chocolate");
	}
	
	public void buyTV(String name) {
		System.out.println("Buy "+name+ " TV");
	}
	
	
//	Overriding method
	public String testReturn() {
		System.out.println("void return");
		return null;
	}
	
//	We need create the test() method with void return type to achieve overriding.
//	public int test() {
//		System.out.println("I am parent class void return method");
//	}

}

class Parent {
	
//	Overrided method
	public void buySoap() {
		System.out.println("Buy Hamam soap");
	}
	
	public void buyRice() {
		System.out.println("Buy rice for food");
	}
	
	public void buyTV(int amount) {
		System.out.println("Buy TV for amount "+amount);
	}
	
//	Overrided method
	public String testReturn() {
		System.out.println("Parent method");
		return null;
	}	
	
	public void test() {
		System.out.println("I am parent class void return method");
	}

}
