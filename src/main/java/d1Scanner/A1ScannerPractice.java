package d1Scanner;

import java.util.Scanner;

public class A1ScannerPractice {

	public static void main(String[] args) {

//		Scanner 
		int comparisionNumber = 10;
//		int myInput = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int myInput = scan.nextInt();

		if (myInput > comparisionNumber) {
			System.out.println("The number I gave is greater than 10");
		} else
			System.out.println("The number I gave is less than 10");

		System.out.println("Please tell us your name: ");
		String userName = scan.next();

		System.out.println("Hello " + userName + " , Good to see you today!.");

		System.out.println("Please enter 5 numbers");

		int a1 = scan.nextInt(); // int a1 = 20;
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		int a4 = scan.nextInt();
		int a5 = scan.nextInt();

		for (int i = 1; i <= 5; i++) {
//			int a = scan.nextInt();
//			if(a>10) {
//				System.out.println("Hello");
//			}

			scan.nextInt();
		}

	}

}
