package c7ForLoop;

public class A3NestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am parent for loop "+ i+ " times ran");

			for (int j = 1; j <= 10; j++) {
				System.out.println("Child"+j);
			}
			
//			for (int j = 1; j <= 10; j++) {
//				System.out.println("Child"+j);
//			}
		}
	}

}
