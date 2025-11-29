package test_String;

public class InterviewQuestionsPracticeString {

	static String str = "Java is a Powerful Language";

	public static void main(String[] args) {

		InterviewQuestionsPracticeString obj = new InterviewQuestionsPracticeString();

//		System.out.println(str);
//		obj.printStringintoChar();
//		obj.charPresentinString('l');
//		obj.countRepeatedLetters("Hello World", 'l');
//		obj.givenCharinString("I am Pradeepa", "w");
//		obj.countCharacter("Automation", 't');
//		obj.upperLowerCase("Apple Beetroot Carrot");
//		obj.countVowels("elephant");
//		obj.removeSpace("Welcome to Java Programming");
//		obj.reverseString("Pradeepa");
//		obj.reverseStringwithoutArray("pradeepa");
//		obj.palindrome("madam");
//		obj.splitSentence("SSM Institute Of Engineering and Technology");
//		obj.stringToArray("Dindigul");
		obj.countDigitLettersChars("mpradeepa000@gmail.com");
	}

//	write a method to get each char from the given String
	public void printStringintoChar() {
		String str = "Pradeepa";
//		System.out.println(str.charAt(4));  //e

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // It will print every char one by one
		}
	}

//	Write a method to check whether the given letter is present in the given String or not. Using CharAt

	public void charPresentinString(char a) {
		String str = "Welcome All";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				System.out.println("Given letter " + a + " is present in the String");
				break;
			}
		}
	}

//	Write a method to check whether the given letter is present in the given String or not. Using Contains
	public void givenCharinString(String str, String ch) {

		if (str.contains(ch)) {
			System.out.println(ch + " is presents in a give string");
		} else {
			System.out.println("Notfound");
		}
	}

//	Write a method to check whether the given letter is repeated how many times. Using "charAt"

	public void countRepeatedLetters(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count = count + 1;
			}
		}
		System.out.println("The letter " + ch + " is presents " + count + " times in a string");
	}

// Count how many times a character is repeated. Using "toCharArray()"
	public int countCharacter(String str, char ch) {
		char[] arr = str.toCharArray();
		System.out.println(arr);
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count = count + 1;
			}
		}
		System.out.println(ch + " is Present " + count + " times");
		return 1;
	}

	// Convert the string to uppercase and lowercase
	public String upperLowerCase(String str) {
		String upper = str.toUpperCase();
		String lower = upper.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		return " ";
	}

	// count the number of vowels in a string

	public int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				count = count + 1;
			}
		}
		System.out.println("Vowels count in the given string is: " + count);
		return 1;
	}

	// Remove Spaces from a string
	public void removeSpace(String str) {
		System.out.println(str.replace(" ", ""));
	}

	// Reverse a String using array
	public void reverseString(String str) {
		char[] arr = str.toCharArray(); // converting the string into array
//        System.out.println(arr); 
//		System.out.println(arr.length);

		for (int i = arr.length - 1; i >= 0; i--) {
			char c = arr[i];
			System.out.print(c);
		}

	}

	// Reverse a String directly
	public void reverseStringwithoutArray(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

	}

	// palindrome

	public void palindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	// split a sentence into words

	public void splitSentence(String str) {
		String[] strarray = str.split(" ");
//			System.out.println(strarray);  it will print memory address

		for (String words : strarray) {
			System.out.println(words);
		}
	}

	// Convert string to char array and print

	public void stringToArray(String str) {
		char[] arr = str.toCharArray();
		System.out.println(arr);

	}

	// Count digits, letters, and special characters

	public void countDigitLettersChars(String str) {

		int letter = 0;
		int digit = 0;
		int spclchar = 0;

		//Using character methods
//		===========================
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//
//			if (Character.isLetter(ch)) {
//				letter++;
//			} else if (Character.isDigit(ch)) {
//				digit++;
//			} else {
//				spclchar++;
//			}
//		}
//		System.out.println("Letters: " + letter);
//		System.out.println("Digits: " + digit);
//		System.out.println("SpclChars: " + spclchar);
//

		//Using ASCII values
//		==========================
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				letter++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				spclchar++;
			}

		}
		System.out.println("Letters: " + letter);
		System.out.println("Digits: " + digit);
		System.out.println("SpclChars: " + spclchar);

	}
	
	
}
