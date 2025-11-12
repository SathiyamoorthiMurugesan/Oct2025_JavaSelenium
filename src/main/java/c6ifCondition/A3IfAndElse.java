package c6ifCondition;

public class A3IfAndElse {

	public static void main(String[] args) {

		if (false) {
			System.out.println("Go to office by bus");
		} else
			System.out.println("Use cab to go to office");

//		System.out.println("*************************************************");

		String str = "Sathya";

		if (str.equals("Sathya")) {
//		if("Sathya".equals("Sathya") ) {
			System.out.println("*************");
		} else
			System.out.println("&&&&&&&&&&&&&");

//		System.out.println("*************************************************");

		String str1 = "sathya";

		if (str.equalsIgnoreCase(str1)) {
//		if("Sathya".equalsIgnoreCase("sathya") ) {
			System.out.println("*************");
		} else
			System.out.println("&&&&&&&&&&&&&");
		
		char abc = 'a';
		char a1 = 'A';
		if(abc != a1) {
			System.out.println("Hello");
		}
		else
			System.out.println("Hii");

	}

}
