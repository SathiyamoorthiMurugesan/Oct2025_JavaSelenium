package test_forEach;

/*
 * The for-each loop (also called enhanced for loop) is used to iterate over Arrays and Collections (like ArrayList, HashSet, etc.)
 * It is mainly used when you do not need the index, but only the value.
 
 * syntax:
     for(datatype variableName : arrayName) {
     }
     
 * When to Use For-each Loop?
        You only need to read values.
        You don’t need the index.
        
 * When NOT to Use For-each?
        When you need the index.
        When you want to modify the array values using index.
        When you need to remove items from a collection while iterating.
 */

public class ForEachNotes {

	public static void main(String[] args) {
		
		String arr[] = {"Hi", "Hello", "Welcome", "to", "Java"};

		for (String each : arr) {
			System.out.println(each);
		}
	}

}
