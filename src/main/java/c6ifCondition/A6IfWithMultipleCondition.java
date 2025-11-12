package c6ifCondition;

public class A6IfWithMultipleCondition {

	public static void main(String[] args) {
		
		int a = 9;

		if (a % 2 == 0) {
			System.out.println(a + " is divisible by 2");

			if (a % 3 == 0) {
				System.out.println(a + " is divisible by 3");
				// content
			}
		}

		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " is divisible by 2 and 3");
		}

		if (a % 2 == 0 || a % 3 == 0) {
			System.out.println(a + " is either divisible by 2 or 3");
		}
	}

}
