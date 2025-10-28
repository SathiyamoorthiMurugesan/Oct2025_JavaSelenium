package testPractice_Java;

//parameter - we can pass multiple parameters inside the method. passing variables as a parameter
//Argument - 

//* Parameterized variables are considered as local variables.
//* It helps us to run a single method with multiple values of same data type.
// *Generally we can not write two methods with same method name. But we can achieve it using parameters

public class Test_VariableAsParameter {

	public void buyFruit() {      //buyFruit is a non-static method with return type as void and it's a non- parameterized method and having access modifier as public
		System.out.println("Buy Fruit");
	}
	
//duplicate method name is not allowed for non-parameterized method
	
	public void buyApple() {
		System.out.println("Buy Apple");
	}
	
	public void buyOrange() {
		System.out.println("Buy Orange");
	}
	
	public static void buyGrapes() {
		System.out.println("Buy Grapes");
	}
	
	public void buyFruits(String fruitName) {  //we can use a same/ duplicate method name as it's a parameterized method
		
		System.out.println("Bought " + fruitName + " Fruit");
	}
	
	public static void fruitQuantity(double quantity) {
		
		System.out.println("Buy "+quantity+" orange");
	}
	
	public void fruit(int quantity,String fruitName) {  //passing multiple parameters in a non-static method
		System.out.println("Buy "+quantity+" Kgs of "+fruitName);
	}
	
	//In the above mentioned methods, we are doing a same work every time (buying fruits). but only a fruit name is getting changed.
	//so, at this point, we can pass parameters inside a method
	
	public static void main(String[] args) {   //main method
	
	Test_VariableAsParameter obj = new Test_VariableAsParameter();
		
     obj.buyFruit();  //calling non-static and non parameterized method
     obj.buyApple();
     obj.buyOrange();
     buyGrapes(); //calling static method directly
     
     obj.buyFruits("banana"); //calling non-static parameterized method
     
     fruitQuantity(1.5);
     
     obj.fruit(2,"Appple");
     }
	
	public void buySnack() {
		
	}

	static void snackCount() {
		
	}
}
