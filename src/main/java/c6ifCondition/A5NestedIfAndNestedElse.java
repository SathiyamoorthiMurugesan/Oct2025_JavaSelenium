package c6ifCondition;

public class A5NestedIfAndNestedElse {

	public static void main(String[] args) {
		int a = 10;
		
		if(a > 10) {
			if(a > 50) {
				System.out.println("My value is greater than 50");
			}
			else 
				System.out.println("My value is less than 50");
		}
		else {
			if(a == 10) {
				System.out.println("My value is 10");
			}
			
			if(a <=10) {
				System.out.println("My value is less than 10");
			}
		}
			
	}

}
