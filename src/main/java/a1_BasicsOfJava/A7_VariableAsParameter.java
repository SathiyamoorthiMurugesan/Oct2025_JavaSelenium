 package a1_BasicsOfJava;

public class A7_VariableAsParameter {

//	Mostly we will deal with non-static methods

//	Parameters - 
//	Arguments - 

//	Variables as parameters in detail
//	* Parameterized variables are considered as local variables.
//	* It helps us to run a single method with multiple values of same data type.
//	* Parameterized variables can be anything, such as Primitive, non primitive, Class, Interface, Object
//	* Generally we can not write two or methods with same method name. 
//		But we can achieve it using parameters

// buySoap() is a non-static method, with return type void and access modifier as public
// as well as, buySoap() is  a non-parameterized method

	public void buySoap() { // called method
		System.out.println("Bought soap");
	}

//	public void buySoap() { // duplicate method
//		System.out.println("Bought soap");
//	}

	public void buyShampoo() {
		System.out.println("Bought Shampoo");
	}

	public void buySoapAndShampoo() {
//		System.out.println("Bought soap");
//		System.out.println("Bought Shampoo");

		buySoap(); // method calling
		buyShampoo();// method calling

		A7_VariableAsParameter obj = new A7_VariableAsParameter(); // local object
		obj.buySoap();
		obj.buyShampoo();
	}

	public void buyHamamSoap() {
		System.out.println("Bought Hamam soap");
	}

	public void buyLuxSoap() {
		System.out.println("Bought Lux soap");
	}

	public void buyCintholSoap() {
		System.out.println("Bought Cinthol soap");
	}

//	String soapName = "Lux";
//	String soapName = "Hamam";
	public void buySoap(String soapName) {
//		System.out.println(soapName);
//		System.out.println("Bought soapName soap");
//		System.out.println("Bought +soapName+ soap");
//		System.out.println("Bought"+soapName+"soap");
//		System.out.println("Bought"   +   soapName    +   "soap");
		System.out.println("Bought " + soapName + " soap");
	}

//	  String str = "Sathya"; 
//	  String str1 = "I am learning java for past 3 years using @gmail"; 
//	  
//	  // I am learning "Java" for past 3 years using @gmail - I want to print like this in Console //
////	  String str2 = "I am learning "Java" for past 3 years using @gmail"; 
////	  String str2 = "I am learning "+"Java"+" for past 3 years using @gmail"; 
//      String str2 = "I am learning \"Java\" for past 3 years using @gmail"; 
//	  String str3 = ""; //Empty 
//	  String str4 = "    "; //Blank. //In Java, space also considered as a character. 
//	  String str5; 
//	  String str5 = null; 
//	  String str6 = "null";

	public void buy10RupeesSoap() {
		System.out.println("Bought 10 rupees soap");
	}

	public void buy50RupeesSoap() {
		System.out.println("Bought 50 rupees soap");
	}

	public void buy100RupeesSoap() {
		System.out.println("Bought 100 rupees soap");
	}

	public void buySoap(int soapAmount) {
		System.out.println("Bought " + soapAmount + " rupees soap");
	}

	public void writeTheAlphabet(char myLetter) {
		System.out.println("The letter you wrote is : " + myLetter);
	}

	public void whatHeSaid(boolean answer) {
		System.out.println("He said : " + answer);
	}

//	Where do we use parameterised methods

//	* You are filling a form in a web page while creating a user
//	* There you need to choose a drop down named country
//	* country = "India"
//	* I need to do this 3 step again and again to make sure the web application is working fine or not.
//	* and each time I choose different country name

	public void chooseCountryIndia() {
		System.out.println("In drop down, India is chosen");
	}

	public void countryDropDown(String countryName) {
		System.out.println("In drop down, " + countryName + " is chosen");
	}

//	Similarly going to a page from your profile in any web page you logged.
//	Go to any menu from a page
//	For these, if we use parameterized methods, we can achieve reuse of code and avoid redundant codes

	public void buySoap(String soapName, int soapAmount) {

		System.out.println("Bought " + soapName + " soap for rupees " + soapAmount);

		System.out.println("Bought " + soapName + " soap");
		System.out.println("Bought " + soapAmount + " rupees soap");

	}

//	public void buySoap(String abc, int aa) {
//		
//		System.out.println("Doing some other work");	
//	}

	public void buySoap(int soapAmount, String soapName) {

		System.out.println("Bought " + soapName + " soap for rupees " + soapAmount);
	}

	public void buySoap(int soapAmount1, int soapAmount2) {

		System.out.println("Bought for rupees " + soapAmount1);
		System.out.println("Bought for rupees " + soapAmount2);
	}

	public static void main(String[] args) {
		A7_VariableAsParameter obj = new A7_VariableAsParameter(); // local object

		obj.buySoap(); // calling the method
		obj.buyShampoo();
		obj.buySoapAndShampoo();

		obj.buyHamamSoap();
		obj.buyLuxSoap();

//		obj.buySoap("3232");
		obj.buySoap("Lux");
		obj.buySoap("Hamam");
		obj.buySoap("Conthol");

		obj.buy100RupeesSoap();
		obj.buySoap(10);
		obj.buySoap(100);

//		obj.writeTheAlphabet();
//		obj.writeTheAlphabet(10);
		obj.writeTheAlphabet('A');
		obj.whatHeSaid(false);

////		**********************************************************
		System.out.println("Multiple parameters");
		obj.buySoap("Hamam", 10);
		obj.buySoap("Dove", 100);

		obj.buySoap(100, "Hamam");

	}

}
