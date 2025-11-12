package d5String;

import d2Array.A3ArrayGenericMethods;

public class StringInterviewQuestions {

	public static void main(String[] args) {
		
		StringInterviewQuestions obj = new StringInterviewQuestions();
//		reverseAStringUsingCharAt("Sathya");
//		
//		String reversedString = reverseAStringUsingCharAt("Selvi");
//		System.out.println("Reversed String is "+reversedString);
		
//		reverseAStringUsingToCharArray("Sathya");
		
//		reverseAStringUsingSplitMethod("Sathiyamoorthi");
		
//		countWordsInASentence();
		
		reverseAllWordsInASentence();
		
//		obj.getEachCharFromString("Sathya");
//		obj.getEachCharFromString("Sathya", 'a');
//		obj.getCountOfGivenCharFromString("Sathya", 'x');
		
//		System.out.println("Sathya".indexOf('s'));
		
//		String sentence = "Despite the stormy weather, she made it to the meeting on time with a smile on her face.";
//		String[] words = sentence.split(" ");
//		A3ArrayGenericMethods gen = new A3ArrayGenericMethods();
//		gen.printArrayUsingBasicForLopp(words);
		
		
//		String newString = sentence.replaceAll(",", "");
//		String newString1 = newString.replaceAll(".", "");
//		String[] allWords = newString1.split(" ");
		
//		System.out.println(sentence.replaceAll(",", ""));
//		System.out.println(sentence.replace(".", "").replaceAll(",", ""));
//		
//		String[] allWords = sentence.replace(".", "").replaceAll(",", "").split(" ");
//		System.out.println(allWords.length);
//		gen.printArrayUsingBasicForLopp(allWords);
	}
	
//	This method helps to get each char from the given String
	public void getEachCharFromString(String a) {
		for(int i = 0; i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
	}
	
//	Write a method to check whether the given letter is present in the given String or not.
	public void getEachCharFromString(String a, char ch) {
		for(int i = 0; i<a.length();i++) {
			if(a.charAt(i) == ch) {
				System.out.println("String "+a+" has the given character "+ch);
				break;
			}
		}
	}
	
//	Write a method to check whether the given letter is repeated how many times
	public void getCountOfGivenCharFromString(String a, char ch) {
		int count = 0;
		for(int i = 0; i<a.length();i++) {
			if(a.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void practiceCharAtMethod() {
		String str = "Sathya";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));

		for (int i = 0; i < str.length(); i++) {
			char myChar = str.charAt(i);
			System.out.println(str.charAt(i));
			if (myChar == 'a') {
				System.out.println("Hello 'a'");
			}
		}
	}

	public static String reverseAStringUsingCharAt(String str) {
//		Sathya 
//		ayhtaS

//		String str = "Sathya";
//		String str = "Yugandhar";
		
//		charAt();
//		for loop
		
		String temp = "";
		
		for(int i = str.length()-1; i>=0; i--) {
//			System.out.println(str.charAt(i));
//			System.out.print(str.charAt(i));
			
			temp = temp + str.charAt(i);
		}
		
		return temp;

	}
	
	public static void reverseAStringUsingToCharArray(String str) {
		
		char[] array = str.toCharArray();
		
//		DemoArray obj = new DemoArray();
//		
//		obj.printCharArrayUsingBasicForLoop(myArr);
		
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
	}
	
	public static String reverseAStringUsingSplitMethod(String str) {
		
		String[] array = str.split("");
//		for(int i = 0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		String temp = "";
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]);	
			temp = temp.concat(array[i]);
//			temp = temp + array[i];
		}
		
		return temp;
	}
	
	public static void countWordsInASentence() {
		
		String str = "Built by Microsoft, Playwright is a Node.js library that, with a single API, automates Chromium, Firefox, and WebKit. These APIs can be used by developers writing JavaScript code to create new browser pages, navigate to URLs and then interact with elements on a page. In addition, since Microsoft Edge is built on the open-source Chromium web platform, Playwright can also automate Microsoft Edge.";
		
		String[] array = str.split(" ");
		System.out.println(array.length);
		
		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		
//		obj.printStringArrayUsingBasicForLoop(array);
		
		
		String temp = str.replace(".", "").replace(",", "");
//		String temp = str.replaceAll(".", "*");
		System.out.println(temp);
		
		String arr[] = temp.split(" ");
		obj.printArrayUsingBasicForLopp(arr);
		
//		String abc = " .,";
//		String[] arr1 = str.split(abc);
//		obj.printStringArrayUsingBasicForLoop(arr1);
		
		
//		String str10="[,\\.\\s $ \\[/, *]";
//		
//		String str5="y[*u$g$a .nd,h//ar";
//		
//		String[] arr=str5.split(str10);
//		for (String a:arr)
//		System.out.println(a);
	
	}
	
	public static void reverseAllWordsInASentence() {
		String str = "Built by Microsoft, Playwright is a Node.js library that, with a single API, automates Chromium, Firefox, and WebKit. These APIs can be used by developers writing JavaScript code to create new browser pages, navigate to URLs and then interact with elements on a page. In addition, since Microsoft Edge is built on the open-source Chromium web platform, Playwright can also automate Microsoft Edge.";
		
		String newString = str.replace(".", "").replace(", ", "");
		
		String[] arr = newString.split(" ");
		
		for(String each: arr) {
//			System.out.println(each);
			System.out.println(reverseAStringUsingCharAt(each));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
