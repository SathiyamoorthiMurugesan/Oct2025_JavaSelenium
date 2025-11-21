package test_WhileLoop;

/*
* A do-while loop executes the loop body at least once, even if the condition is false, because the condition is checked after the loop body.

*syntax:
====================== 
    initialize;
    do {
         loop body
         increment/ decrement;
} while (condition); 

* When should you use do-while?
----------------------------------------------------------
      You must execute the code at least once.
      Example: menu-driven programs, asking user for input until valid, etc.
      
      
Feature	                           while Loop	                                         do-while Loop
------------------------    ------------------------------                    -------------------------------------
Condition Checking 	          Before the loop body	                                 After the loop body
Runs at least once?	                 ❌ No	                                                 ✅ Yes
Syntax Ends With ;	             ❌ No semicolon	                                      ✅ Ends with semicolon
Usage	               When you want to check condition first               When you want code to run at least once

*/

public class DoWhile {

	public static void main(String[] args) {
	
		int i = 1;      //initialize
		
		do
		{
			System.out.println("Hii...How are You?");
			i++;       
		} while( i <= 5);

	}

}
