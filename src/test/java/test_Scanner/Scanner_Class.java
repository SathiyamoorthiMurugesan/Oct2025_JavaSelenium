package test_Scanner;

import java.util.Scanner;

/*
 * Scanner is a class in Java used to take input from the user. It is part of the package java.util.
 * You can use Scanner to read:
                1. integers (nextInt())
                2. floating values (nextFloat(), nextDouble())
                3. single words (String) (next())
                4. whole lines (nextLine())
                5. characters (indirectly using next().charAt(0))
                
  * Syntax for Scanner:
           Scanner scanner = new Scanner(System.in);      //creating obj for a scanner class
           
           Scanner(System.in)    ->    calls the constructor of the scanner class
           
  * 'System.in' means take the input from the keyboard. It is a predefined "InputStream object" in Java.
    It represents the standard input device, which is usually the keyboard.
  
        * System -> final class in java
        * in -> public static final variable presents in System class. (public static final InputStream in;)
        * InputStream is an abstract class used for reading binary data (bytes).
          So System.in reads raw bytes from keyboard input.
    
  * nextInt(), next()..are the methods presents in Scanner class which is used to read the integer, string values..
           
 */

public class Scanner_Class {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");

		int input = scanner.nextInt(); // without this nextInt() method, we can't enter the input in the console

		if (input < 10) {
			System.out.println("You have entered a number which is lesser than 10");
		} else if (input >= 10 && input <= 50) {
			System.out.println("You have entered a number which is in range of 10 to 50");
		} else {
			System.out.println("You have entered a number which is greater than 50");
		}

	}

}
