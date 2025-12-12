package Test_WrapperClass;
/*
* Why Java is not 100% OOPs language is because of primitive data types.	 
* int, double, char, float, short, boolean, long, byte - all are primitive data types
* means, they can hold a value but they are not having any inbuild methods.  (String is a non-primitive datatype which has inbuild methods for manipulations)
* Simply, datatypes are not Objects

* Wrapper classes helps us to use primitive data type as Objects
* A wrapper class in Java provides a mechanism to convert primitive data types into objects and vice-versa. 

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boolean

* int a = 5; primitive datatype
* Integer a = 5; Object
* Interger a = new Integer(5); its depricated.
* 
*/

//Autoboxing: Automatic conversion of primitive types to their corresponding wrapper class objects.

//Unboxing: Automatic conversion of wrapper class objects to their corresponding primitive types.

//Nullability: Unlike primitives, wrapper classes can hold a null value, which can be useful in certain situations.


public class Practice_WrapperClass {

	public static void main(String[] args) {
		
		int a=10;  //primitive data type
		
		Integer b; //Object 
		
		b=a;  //int to Integer conversion..AutoBoxing
		
		Integer num = Integer.valueOf(a);  //another way of auto boxing
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(num);
		
		System.out.println(b.equals(a));
		
//		int c = null;  Type mismatch: cannot convert from null to int
		
		Integer c = null;
	
		
	//int to Integer conversion - Auto boxing	
		int num1 = 20;
		Integer num2;
		num2 = num1;  
		
		//another way
		Integer num3 = Integer.valueOf(num1);
		
   //Integer to int conversion - Unboxing
		
		Integer val = 40;
		int val2 = val;
		
//		another way
		
		int val3 = Integer.valueOf(val2);
		int val4 = val.intValue();
		
		
		//Parsing:  Converting Strings to Primitive Data Types or Objects:
		
		String str = "123";
		int number = Integer.parseInt(str);
		Integer integerobj = Integer.valueOf(str);
		System.out.println(number);
		System.out.println(integerobj);
		
		
		
		

	}

}
