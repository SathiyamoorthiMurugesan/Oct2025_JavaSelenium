package Test_Overriding;

//Overriding happens between two classes
//It's also called as Runtime Polymorphism

//To achieve Overriding, We have to use Inheritence concept and Object creation,
//       where we create object for child class by keeping the parent class as a reference. 
//Because normally, through object we can access only reference class's non-static methods.
//but here, both parent and child class having same method, Using this override concept, it will print the method from child class


/*In order to achieve this, 
    
    *Method name should be same in parent and child class
    *Type, order and number of parameter should same between parent and child
    *Return type of methods between child and parent methods must be same */

//	* Overriding is not possible between two static methods. Overriding is based on object creation only.
//  * We can't use object to access static method. so overriding is not possible with static methods  

public class OverRiding { // parent class

	public static void main(String[] args) {
		OverRiding obj = new ClassA(); // creating object for child class by keeping parent class as a reference
		obj.methodA();     //overridden happened here. 
		//First object will search the method in child class (right side). If it's there it will override the method from parent class
	
		ClassA.methodB();
		methodB();

	}

	public void methodA() {
		System.out.println("Method A from Parent class");
	}

	static int methodB() {
		System.out.println("Method B from Parent class");

		return 1;
	}

}

class ClassA extends OverRiding { // child class

	public void methodA() {
		System.out.println("Method A from Child class");

	}

	static int methodB() {
		System.out.println("Method B from Child class");

		return 1;
	}

}
