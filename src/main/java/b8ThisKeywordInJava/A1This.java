package b8ThisKeywordInJava;

//*****this keyword ************************

//this - same class

//* this. keyword is used to call instance/class variables and methods within a class
//* this. keyword is always present implicitly when we call instance/class variables and methods within the class.
//	* We can use this., to differentiate run time variables/local variable from instance variables;
//	* Also by using this., we can assign runtime values to instance variables
//* When we call a non static method from another non static method in a same class, "this." is used implicitly while calling
//	* calling a method(), is same as this.method() with in a same class. Only for calling non-static from static, we need to create object
//* We can not use this. inside the static method

//* within a class, 
//1) we can simply call static method from another static method (this keyword is applied implicitly, but we always prefer static type calling)
//2) We can simply call non-static method from another non-static method (this keyword is applied implicitly)
//3) We need to create object to call a non-static method from a static method
//4) We can simply call static method from non-static method (this keyword is applied implicitly, but we always prefer static type calling)

//* We can not use this. keyword inside a static method.


public class A1This {

}
