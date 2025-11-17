package c7ForLoop;

public class A5ForLoopPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print(j);
					break;   //it will stop the inner for loop, once the if condition is met
				} else
					System.out.print("-");
			}
			System.out.println();
		}
	}
}

