package test_SwitchCase;

/*
 * If we have finite values with distinct(separate/exact values) choice (no condition/ range) then we can use switch statement.
 * Switch cannot be used when values are ranges. Ex: a>2 or age>18 - these are conditions. so use if-else statement.
 
 * Use switch when:
           1.You are checking equality (==)
           2.Against separate values (1, 2, 3…)
           3.Values are known in advance
           4.You want cleaner, readable code
  
 * We have to use 'break' in each case. If you omit break, execution continues to the next case till default statement (fall-through).
 * We can put break statement in default also. but it's not needed if it is in last place.
 * 'break' is used to terminate the switch statement, once the condition is satisfied.
 
 * We should pass the variable name (parameter) inside switch and variable value (argument) with case.
 * 
 */

public class SwitchClass {

	public static void main(String[] args) {
		
		String str = "Chocolate";
		
		switch(str) {
		
		case "Chocolate":
			System.out.println("Buy Dairymilk and Kitkat");
			break;
			
		case "Chips":
			System.out.println("Buy Lays and Bingo");
			break;
		
		case "Fruits":
			System.out.println("Buy Apple and Orange");
			break;
			
		default:
			System.out.println("Buy any snacks to eat. I am hungry!!");
			//break;        //not necessary to put the break statement here, since it is the last statement.
		}

	}

}
