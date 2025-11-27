package test_String;

/*
 * String is a non-primitive data type as well as it's a class in java.
 * We can declare string in two types. one is using string object and another one is using string literals.
            
            String str = "abc";                 --string literals
            String str = new String("abc");     --string object
 
 * In General, String is sequence of characters or array of characters
 * 
 */

public class StringTestPractice {

	public static void main(String[] args) {
		
		String str = "pradeepa";
		String str1 = "";      //empty is also a string
		String str2 = "    ";  //space/blank is also a String
		String str3 = "Pradeepa";
		String str4 = "  I Love Java  ";
		
		System.out.println(str.toUpperCase() + "  Uppercase");
		System.out.println(str.toUpperCase().toLowerCase() +"  Lowercase");   //1st it will convert the string to uppercase and then again convert to lowercase
		
		System.out.println(str.length()+"  nrml string length");   //8
		System.out.println(str1.length()+"  empty string length");  //0
		System.out.println(str2.length()+"  blank string length");  //4.  because it has 4 spaces
		
		System.out.println(str1.isEmpty()+"  check isempty");    //--true   //It will return boolean value 
		System.out.println(str2.isEmpty()+"  check isempty");    //--false
		
		System.out.println(str.charAt(4)+"  charat");   //it will print the character which is in 4th index
		//System.out.println(str1.charAt(3)+"  charAt");   it throws outOfBoundsCheckIndex exception..because we are using empty string
		System.out.println(str2.charAt(3)+"  charat");   //it will print a space
		System.out.println(str4.charAt(2)+"  charAt");
		
		System.out.println(str.equals(str3)+"  equals");  //false
		System.out.println(str.equalsIgnoreCase(str3)+"  equalsIgnorecase");  //true
		System.out.println(str1.equals(str2));  //false
		
		System.out.println(str.contentEquals(str3)+"  contentEquals");  //false
		System.out.println(str.contentEquals("pradeepa"));  //true
		
		//compare two strings lexicographically (dictionary order).
		//Java compares Unicode values of each character one by one. 'a' → 97, 'b' → 98, 'A' → 65
		//compareTo() treats uppercase and lowercase as different. The moment characters differ, comparison stops.
		//0 → equal | positive → calling string is greater | negative → calling string is smaller
		System.out.println(str.compareTo(str3)+"  compareTo");  //32
		System.out.println(str.compareToIgnoreCase(str3)+"  compareToIgnoreCase");  //0
		
		System.out.println(str.startsWith("p")+ "  startswith");  //true
		System.out.println(str.startsWith("pra")+ "  startswith"); //true
		System.out.println(str.startsWith("dee")+ "  startswith");  //false
		System.out.println(str1.startsWith("")+ "  startswith"); //true
		System.out.println(str2.startsWith(" ")+ "  startswith"); //true
		
		System.out.println(str.endsWith("pa")+"  endswith");  //true
		System.out.println(str4.endsWith("Java")+"  endswith");  //true
		
		//Returns the index within this string of the "first occurrence" of the specified substring.
		System.out.println(str.indexOf("a")+"  indexOf");   //passing string as a parameter..so it returns the index position 2
		System.out.println(str.indexOf("z")+"  indexOf");   //give o/p as '-1'. because z is not presents in the string
		System.out.println(str2.indexOf("")+"  indexOf");  //0
		
        //Returns the index within this string of the last occurrence of the specified substring
		System.out.println(str.lastIndexOf("a")+"  lastIndexOf");   //7
		System.out.println(str2.lastIndexOf("a")+"  lastIndexOf");   //-1
		System.out.println(str.lastIndexOf("")+"  lastIndexOf");   //8
		System.out.println(str.lastIndexOf(" ")+"  lastIndexOf");   //-1
		System.out.println(str2.lastIndexOf(" ")+"  lastIndexOf");   //3...because it contains 4 spaces
		
		//Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
		System.out.println(str.substring(0)+"  subString");  //pradeepa
		System.out.println(str.substring(3)+"  subString");  //deepa
		System.out.println(str4.substring(2)+"  subString");  //Love Java
		
		
		//Returns a character sequence that is a subsequence of this sequence.//str.subSequence(begin, end)
		System.out.println(str.subSequence(0, 3));  //pra
//		System.out.println(str.subSequence(0, 9));  //throws outOfBoundsCheckFromToIndex Exception
		System.out.println(str.subSequence(0, 6));  //pradee
		System.out.println(str4.subSequence(0, 9)); //I Love Ja
		
		System.out.println(str.concat(str4)+"  Concat");  //pradeepaI Love Java
		System.out.println(str2.concat(str4));   //    I Love Java
		
		//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println(str.replace('a', 'A')+"  replace");  //prAdeepA
		System.out.println(str2.replace(' ','H')+"  replace");  //HHHH
		System.out.println(str4.replace("I", "Pradeepa"));  //Replacing I with Pradeepa.. so it prints "Pradeepa Love Java"
		
		//Tells whether or not this string matches the given regular expression.
		System.out.println(str.matches(str3));  //false
		System.out.println(str.matches("pradeepa")+ "  matches");  //true
		 
		//Returns true if and only if this string contains the specified sequence of char values.
		System.out.println(str.contains("a")+"  contains"); //true
		System.out.println(str.contains("deepa")+"  contains"); //true
		System.out.println(str4.contains("oc")+"  contains"); //false
		System.out.println(str.contains("deepapra")+"  contains"); //false
		
		System.out.println(str.split(str4)+"  split"); //It returns memory address.To print Actual elements we have to use like System.out.println(Arrays.toString(array));

		//join multiple strings with a separator.
		System.out.println(str.join("-", "I","loves","Java"));  //I-loves-Java
		
		//remove spaces from the beginning and end of a string.. leading spaces (before text) | trailing spaces (after text)
		//It does NOT remove spaces inside the string.
		System.out.println(str4.trim());
		
		
		//strip() uses Unicode standards and removes all kinds of whitespace.Because trim() only removes ASCII whitespace
		System.out.println(str4.strip());
		String s = "\u2003Java\u2003";    //Unicode whitespace: \u2003 (EM SPACE)
		System.out.println(s.trim());   // won't remove
		System.out.println(s.strip());  // will remove
		
		System.out.println(s.stripLeading()+"  StripLeading");  //only remove leading(before) whitespace
		System.out.println(s.stripTrailing()+"  StripLeading");  //only remove trailing(after) whitespace
		System.out.println(str4.stripTrailing()+"  StripLeading"); //  I Love Java  StripLeading
		System.out.println(str4.stripLeading()+"  StripLeading");  //I Love Java    StripLeading
		
		
		//This object (which is already a string!) is itself returned.
		System.out.println(str.toString());  //pradeepa
		System.out.println(str4.toString()); //  I Love Java  
		
		//Converts this string to a new character array.
		System.out.println(str3.toCharArray());
		String ss = "Java";
		char[] arr = ss.toCharArray();

		for (int i = 0; i <=arr.length - 1; i++) {
		    System.out.println(arr[i]);
		}
		
		//format() - Returns a formatted string using the specified format string and arguments.
		String st = String.format("Name: %s, Age: %d", "John", 25);   //%s - string, %d - integer
		System.out.println(st);
		
        //String.valueOf() is a static method in the String class that converts any data type into a String.
        System.out.println(str.valueOf(1));

        //repeat()
        System.out.println(str.repeat(2));  //pradeepapradeepa
        System.out.println(str4.repeat(4));
		
		

	}

}
