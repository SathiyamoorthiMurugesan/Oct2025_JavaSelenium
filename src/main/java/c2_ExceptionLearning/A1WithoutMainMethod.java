package c2_ExceptionLearning;

//* The class Exception and its subclasses are a form of
//* {@code Throwable} that indicates conditions that a reasonable
//* application might want to catch.
//*
//* The class Exception and any subclasses that are not also
//* subclasses of RuntimeException are checked
//* exceptions

public class A1WithoutMainMethod {

//	public static void main(String[] args) {
//		System.out.println("Hello");
//	}
	
	public static void main(String[] args) {
//		System.out.println(1/0);
//		System.out.println("if you dont know Maths, thats fine!");
		
		int a = 10;
		int b = 10;
		try {
//		int ab = "abc";
		int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
//		catch(Exception e) {
			System.out.println("Please enter divider, other than Zero");
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		}
		
		System.out.println("if you dont know Maths, thats fine!");

	}

}
