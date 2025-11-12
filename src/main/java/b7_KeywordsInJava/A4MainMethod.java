package b7_KeywordsInJava;

public class A4MainMethod {
	
//	JVM needs main method in exact format 
//	JVM executes each line from main method through main thread.
//	We can overload main method
//	We can not override main method because its static
//	The reason for main method to be static is, to be called by JVM without creating object for the class.

//	public static void main(String[] args) {
	static public void main(String[] args) {
		System.out.println("String[]");
	}
	
	public void main() {
		
	}
	
//	static public void main(String[] abc) {
//		System.out.println("Hello");
//	}
	
	static public void main(int abc) {
		System.out.println("int");
	}
	
	static public void main(String abc) {
		System.out.println("String");
	}

	static public void main(int[] abc) {
		System.out.println("int[]");
	}
}
