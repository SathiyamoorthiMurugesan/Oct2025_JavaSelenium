package test_ForLoop;
/*
for(initialize;condition;iteration(increment/decrement)){
statements..
}
*/
//======================================================================
//How it will work?    - Initialize -> Checks the condition -> prints the statement -> iteration 

//for(initialize; condition;) {
//**content*****
//increment/decrement;
//}

//Ex:
//====
//Start
//Initialize i = 1
//Check if i <= 5
//If true, print "Number: i"
//Increment i
//Go back to the condition
//When i becomes 6, condition becomes false
//Exit loop
//End program


/*
 * Parent for loop controls -> rows
 * Child for loop controls -> columns
 */



/*📌 Simple rule to remember
===============================
Variable	Declared in 	Available in which scope?
i	        Parent loop	    Inside parent loop + child loop
j	        Child loop	     Only inside child loop

Why we can't use the loop variable outside?
================================================
     Java follows block scope:
     A variable declared inside { } is accessible only inside those { }.

But we can use the loop variable outside the loop, only if it is declared in class level
*/

/*
 Where and when to use 'break'?
 ============================================
break is used to stop the loop immediately.

Use it when:
     You found what you are searching for
     You want to exit the loop early
     You want to stop a child loop inside a nested loop
Example (exit child loop when j == i)
*/

public class ForLoopBasic {

	public static void main(String[] args) {
		
		for(int i =1; i<5; i++) {
			System.out.println("Value of i is: "+ i);
		}

	}

}
