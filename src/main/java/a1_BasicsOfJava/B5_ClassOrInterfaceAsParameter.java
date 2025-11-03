package a1_BasicsOfJava;

public class B5_ClassOrInterfaceAsParameter {
	
	static int aa = 10;

	public static void main(String[] args) {
		B5_ClassOrInterfaceAsParameter obj = new B5_ClassOrInterfaceAsParameter();
		int a = 25;
		obj.methodEx(a);  //methodEx() needs int as a parameter, so we are passing local variable a as the parameter
		obj.methodEx(10); //here we are passing direct int value as a parameter
		obj.methodEx(aa); //here we are passing class level static variable as a parameter 
		obj.methodEx(obj.methodEx2()); //here we are passing methodEx2() as a parameter because methodEx2() going to return int
		
		obj.method1(null); //method1() needs "ClassInterfaceAsParameter" as a parameter. default value for class as a variable is null;
		
		ClassInterfaceAsParameter obj2 = new ClassInterfaceAsParameter();
		obj.method1(obj2);
		
		obj.method1(ClassInterfaceAsParameter.methodA());//here we are passing methodA() as a parameter because methodA() going to return the class "ClassInterfaceAsParameter"
		obj.method1(obj2.methodB()); //here we are passing methodB() as a parameter because methodB() going to return the class "ClassInterfaceAsParameter"
	
//		likewise we can use interface as a parameter too
		
//		Java Example:
//		String
		
//		Class as a parameter
		
//		In String class we have the below method which takes same class (String) as a parameter
//		public boolean startsWith(String prefix) {
//	        return startsWith(prefix, 0);
//	    }
		
//		How do we call or use the above method 
//		obj.startsWith(null);
//		obj.startsWith("Sathya");
//		String str = "Sathya";
//		obj.startsWith(str);
		
//		In String class  we have the below method which returns same class (String) as a parameter 
//		  public String toUpperCase() {
//	        return toUpperCase(Locale.getDefault());
//	    }
		
//		obj.startsWith(obj.toUpperCase());
		
//		*********************************************
		
//		Interface as a parameter
		
//		ArrayList is a predefined class in Java, it contains one of the below methods
//		public boolean retainAll(Collection<?> c) {
//	        return batchRemove(c, true, 0, size);
//	    }
		
//		For retainAll method, we need to pass interface (Collection) as a parameter
		
//		***********************************************************
		
//		Interface as a return type
		
//		List is a predefined interface in Java, it contains one of the below methods
		
//		ListIterator<E> listIterator();  
//		Here listIterator() method does some work and return us an interface (ListIterator) 
		
		
			
	}
	
	public void methodEx(int a) {
		
	}
	
	public int methodEx2() {
		
		return 100;
	}
	
	
	public void method1(ClassInterfaceAsParameter CI) {
		
	}

}

class ClassInterfaceAsParameter {
	
	static ClassInterfaceAsParameter abc;
	
	public static ClassInterfaceAsParameter methodA() {
		System.out.println("I am static method from ClassInterfaceAsParameter class ");
		return abc; 
	}
	
	public ClassInterfaceAsParameter methodB() {
		System.out.println("I am non-static method from ClassInterfaceAsParameter class ");
		return abc;
	}
}


