package b8ThisKeywordInJava;

//* All child class constructors have super() method written implicitly.
//* If we written super() explicitly, we cant use this() inside constructor. 
//	But while super() is implicit, we can use this(). So in this case both super() and this() will run; 
//	* Because this() is the child class default constructor, within that, parent class default constructor would be present.
//* whenever we call a child class constructor, parent class constructor will be always called because
//	* in child class constructor, super() keyword is implicitly written and it will call the parent class default constructor
//* Child class's parameterized constructor ALWAYS have super() implicitly written but NOT super(parameterized);
//* Parameter passed in child class constructor wont be passed to super()
//* If we want our child class's parameterized constructor to call parent class's parameterized constructor,
//	* then we need to pass the parameter to super() by overriding it. e.g(super(5) or super("Sathya"))

//* From child class constructor, we can either call parent class constructor(super()) or child class constructor(this()).
//* The only time, we can use super() and this()/this(parameter) is, when super() is implicitly present.

public class D1SuperMethod {

}
