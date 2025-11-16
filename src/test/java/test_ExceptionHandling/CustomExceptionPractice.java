package test_ExceptionHandling;

public class CustomExceptionPractice extends Exception{
	
	public CustomExceptionPractice() {       //creating default constructor explicitly to create obj without parameter in main method
		
	}
	public CustomExceptionPractice(String message) {
		super(message);
	}
	
	
	public void method1(int amount, int balance) throws CustomExceptionPractice {
		
		if(amount>balance) {
			throw new CustomExceptionPractice("Insufficeient balance");
		}
		else {
			System.out.println("Your have suffiecient balance: "+ balance);
			System.out.println("You can withdraw the entered amount: " + amount);
		}
	}
	

	public static void main(String[] args) throws CustomExceptionPractice {
		CustomExceptionPractice obj = new CustomExceptionPractice();
		try {
		obj.method1(6000, 2000);
		}
		catch (CustomExceptionPractice e) {
			System.out.println(e.getMessage());
		}
		
	}

}
