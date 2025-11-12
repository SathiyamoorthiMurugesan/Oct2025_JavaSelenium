package c6ifCondition;

public class A2IfBasic {

//	if syntax - 
//	if(condition) {
//	}
	
//	condition - comparision which gives us either true or false 
	
//	Single and multiple if

	public static void main(String[] args) {

		int soapAmount = 11;

		if (soapAmount == 10) {
			System.out.println("Bought soap");
		}

		if (soapAmount > 10) {
			System.out.println("Buy Shampoo");
		}

		if (soapAmount == 1000)
			System.out.println("Dont buy");
			System.out.println("Come home");
	}

}
