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

public class ForLoopBasic {

	public static void main(String[] args) {
		
		for(int i =1; i<5; i++) {
			System.out.println("Value of i is: "+ i);
		}

	}

}
