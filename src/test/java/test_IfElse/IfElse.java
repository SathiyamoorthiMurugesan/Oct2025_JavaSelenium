package test_IfElse;

//If-else is a control flow statement
//condition inside if() must be boolean
//we can also pass a method as a condition which has return type as 'boolean'.
//if(true) {....} - it will run the code that presents inside a block
//we can write if condition without any block also. At this time, the immediate line which presents after if(condition) will belongs to if.
//Ex: if(false)
//      sysout(1);
//      sysout(12);
//  It will print 12, since the condition is false. only immediate 1st line comes under if's scope

//condition - comparison which gives us either true or false 

//we can have only if condition.
//if - if - if
//if - else
//if - else if - else
//if - else if - else if - else
/*if  - Nested if
    statement
      if 
         statement
      else 
         statement
   else
     statement
 */

//if (con1||con2||con3)

public class IfElse {

	public static void main(String[] args) {
		int a = 1;
		if (a > 0) {
			System.out.println("a is greater than 0");
		}

	}

}
