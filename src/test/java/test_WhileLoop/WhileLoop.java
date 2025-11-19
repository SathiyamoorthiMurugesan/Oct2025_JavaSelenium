package test_WhileLoop;

/*
 * A while loop in Java is a control flow statement that repeatedly executes a block of code as long as a specified Boolean condition remains true. 
 * It is an entry-controlled loop, meaning the condition is evaluated before each iteration of the loop. 
 
✔ The condition must be true for the loop to run
✔ If the condition becomes false, the loop stops

Flow of Control
    1. Check condition
    2. If true → execute loop body
    3. Repeat step 1
    4. If false → exit loop

When to use while loop?
    1. You don’t know how many times the loop should run (Example: read input until user enters -1)
    2. Loop should continue until a condition becomes false
    
Syntax:
      intialize;
      while(condition){
      statements;
      .
      .
      increment/ decrement
      }
*/

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 2;  //initialization before loop
        while(i<=5) {      //it will prints the number from 2 to 5
        	System.out.println("Value of i is: "+i);
        	//i++;           //if we forget to put the increment, it will become infinite loop. means it prints 2 infinitely.
        }
	}

}
