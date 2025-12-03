package testPractice_Java;

public class Java_PracticePrograms {

	public static void main(String[] args) {

		Java_PracticePrograms obj = new Java_PracticePrograms();

//		obj.reverseString("The Learning Hub");
//		obj.palindrome("Amma");
//		obj.fibonacciSeries();
		obj.countVowelsConsonants("Elephant");
	}

	public void reverseString(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed String is: " + reverse);
	}

	public void palindrome(String str) {
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

	public void fibonacciSeries() { // Each subsequent number is a sum of two preceding numbers (Ex:
									// 0,1,1,2,3,5,8,13)

		int n = 10;
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + "," + num2);

		for (int i = 2; i <= 10; i++) {
			int num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}

	}

	public void countVowelsConsonants(String str) {

		int vowel = 0;
		int cons = 0;
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			char letter = ch[i];
			if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
				vowel = vowel + 1;
			} else {
				cons = cons + 1;
			}
		}
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonant: " + cons);
	}

}
