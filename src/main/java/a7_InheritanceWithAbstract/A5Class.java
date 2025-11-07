package a7_InheritanceWithAbstract;

public class A5Class {

	public static void main(String[] args) {

		A3AbstractClass.methodA33();

		A4Class obj = new A4Class();
		obj.methodA31();
		obj.methodA32();
	}

}

class A6Class extends A4Class {
	
	public void methodA61() {
		
	}

	public static void main(String[] args) {
		A3AbstractClass.methodA33();

		A6Class obj = new A6Class();
		obj.methodA31();
		obj.methodA32();
		obj.methodA61();
		
		
		A4Class obj1 = new A4Class();
		obj1.methodA31(); //A3AbstractClass's non-static method
		obj1.methodA32(); //A3AbstractClass's non-static abstract method but implemented in A4Class
//		obj1.methodA61();
	}
}