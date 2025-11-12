package c3ThrowAndThrows;

public class A3ThrowRunTimeExceptions {
	
//	How do we handle run time exception 
	
	public void methodA() {
		try {
			System.out.println("Hello");
		}
		
		catch(ArithmeticException e) {
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {

		throw new ArithmeticException();
	}

}
