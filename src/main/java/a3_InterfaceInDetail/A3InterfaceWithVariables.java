package a3_InterfaceInDetail;

public interface A3InterfaceWithVariables {
	
//	We can create variables inside interface ( local, static and non-static)
//	Local variables are simple and they are not final in nature, means, 
//		*we can change/assign its value even after initialization
//	static and non-static variables in interface are final in nature, means,
//		* we need to initialize it while declaring
//		* Once you initialize, you can not change the variable's value
	
//	Variables
//		* Local variable
//		* non-static variable
//		* static variable
	
	
//	variables declaration + initialize
	int b = 20;
//	int static c = 30;
	static int c = 30;
	
	
//	variables declaration
//	int bb;
//	static int cc;
	
	public static void method1() {
		int a = 10;
		
		int aa;
		
		a = 20;
		aa = 20;
		aa = 30;
		
//		c = 300;
		
	}
	
	
	
	
	
	

}
