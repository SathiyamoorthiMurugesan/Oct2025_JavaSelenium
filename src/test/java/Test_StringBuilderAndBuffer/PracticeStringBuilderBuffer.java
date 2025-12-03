package Test_StringBuilderAndBuffer;

/*
 * Normally String Literals are Immutable in Java.
 * But String Buffer and String Builder both are mutable. means it will not create new object, if we perform any operations on that string.
   instead it will overwrite the existing object.
 
 * It Designed for efficient string manipulation when frequent modifications are required, unlike the immutable String class.

 * String Buffer:
 =================
      * String Buffers are synchronized and it's methods are Thread Safe.
                                                             ------------
      * This ensures that only one thread can access and modify the StringBuffer object at a time
      *  The synchronization overhead makes StringBuffer operations generally slower compared to StringBuilder.
      
 * String Builder:
 =================
      * String Builders are non-synchronized and it's methods are Not Thread Safe.
                                                                  ----------------- 
      * Multiple threads can access and modify it concurrently without any built-in synchronization mechanisms 
      
When to use which:
======================
* Use StringBuffer when working in a multi-threaded environment where multiple threads might access and modify the same string object concurrently, 
      and thread safety is a critical concern.
    
* Use StringBuilder when working in a single-threaded environment, or when you are responsible for managing synchronization externally in a multi-threaded context.
      StringBuilder is the preferred choice when performance is a priority and thread safety is not an inherent requirement of the string manipulation itself.
 */

public class PracticeStringBuilderBuffer {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Java");
		StringBuilder str1 = new StringBuilder("Java");
		
		System.out.println(str.equals(str1));
		
		/*
		 * Object.equals() simply checks reference equality → whether both references point to the same object in memory.
		 * Here str → points to one StringBuilder object
		        str1 → points to a different StringBuilder object  (even though contents are same)
		 * So, It prints false
		 */
		
		System.out.println(str.length());
		
		
		StringBuffer str2 = new StringBuffer("Selenium");
		StringBuffer str3 = new StringBuffer("Java");
		
		System.out.println(str2.reverse());
		System.out.println(str.append(str2));  //JavamuineleS
		
		String sentence = new String("Hii All");
		StringBuilder sentence1 = new StringBuilder("Hii All");
		
		System.out.println(sentence.toLowerCase());   //nrml string class
		System.out.println(sentence1.reverse());      //string builder class
		
		System.out.println(sentence);  //It will print the old value 'Hii All'. because lowercase operation will store in different object
		System.out.println(sentence1);  //It will overwrite the old object and prints the reversed method




	}

}
