package c7ForLoop;

public class A4BasicForLoopPattern {

//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5
//	1 2 3 4 5 
//	4x5 - Matrix

//	Parent for loop controls the row
//	Child for loop controls the values of each row

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
//			System.out.println(i);
			for (int j = 1; j <= 5; j++) {
//				System.out.println(j);
				System.out.print(j + " ");
			}
			System.out.println();
		}

//	1 1 1 1
//	2 2 2 2
//	3 3 3 3 
//	4 4 4 4
//	5 5 5 5 
//	5x4 matrix

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
