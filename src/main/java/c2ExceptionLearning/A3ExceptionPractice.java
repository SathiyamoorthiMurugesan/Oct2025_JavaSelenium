package c2ExceptionLearning;

public class A3ExceptionPractice {
	
	
	
	public static void main(String[] args) {
		int a = 10;
//		int b = 10;
		int b = 0;
		int c ;
		
//		c = a/b;
//		System.out.println(c);
		
//		***************** try and correct exception catch *********************
		
//		try {
//			c = a/b;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Please dont say 0");
//			b = 20;
//			c = a/b;
//			
//		}
//		System.out.println("hello");
		
//		**************************End****************************
		
//		***************** try with finally ************************
		
//		try {
//			c = a/b;
//		}
//		
//		finally {
//			System.out.println("divide by 0 is not allowed");
//		}
		
//		**************************End****************************
		
//		***************** try and incorrect exception catch *********************
//		
//		try {
//			c = a/b;
//		}
//		catch(NullPointerException e) {
//			System.out.println("Please dont say 0");
//			b = 20;
//			c = a/b;
//			
//		}
//		finally {
//			System.out.println("divide by 0 is not allowed");
//		}		
//		System.out.println("hello");
//		
//		**************************End****************************
		
//		***************** try and multiple catches *********************
//		
//		try {
//			c = a/b;
//		}
//		
//		catch(NullPointerException e) {
//			System.out.println("Catched Null pointer exception");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Catched arithmetic exception");
//		}
//		finally {
//			System.out.println("divide by 0 is not allowed");
//		}	
//		System.out.println("hello");
//		
//		**************************End****************************
		
//		***************** try and multiple catches with parent catch *********************
//		
//		try {
//			c = a/b;
//		}
//		
//		catch(NullPointerException e) {
//			System.out.println("Catched Null pointer exception");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Catched arithmetic exception");
//		}
//		catch(Exception e) {
//			System.out.println("Catched Exception");
//		}
//		finally {
//			System.out.println("divide by 0 is not allowed");
//		}	
//		System.out.println("hello");
//		
//		**************************End****************************
		
//		***************** try and parent catch *********************
//		
		try {
			c = a/b;
		}
		
		catch(Exception e) {
			System.out.println("Catched Exception");
			System.out.println(e.getMessage());
		}
		
//		catch(NullPointerException e) {
//			System.out.println("Catched Null pointer exception");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Catched arithmetic exception");
//		}

		
		System.out.println("hello");
//		
//		**************************End****************************
		
	}
	
	/*

	public static void main(String[] args) {

//		int a, b;
		int a = 10;
		int b = 0;
		int c;

		String str = null;

		try {
			c = a / b;
//			str.toLowerCase();
//			throw new NullPointerException();
			System.out.println("To check the try block");
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(IOException e) {
//		System.out.println(e.getMessage());
//		}
		catch (NullPointerException e) {
			System.out.println("We have captured the null pointer exception");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
//		finally {
//			System.out.println("aaa");
//		}

		System.out.println("hello");
	}

}

class ATMPractice {

	public void getMoneyFromATM() {

		System.out.println("Please enter an amount");

//		try {
//			int amount = 40;
//			if(amountGreaterThan99 and lessThan500)
//		} catch (AmountLessThan100Exception e) {
//
//		} catch (excep2 e) {
//
//		}
//		finally {
//			System.out.println("please enter multiples of 100");
//		}

	}

*/
}

