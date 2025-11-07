package a3_InterfaceInDetail;

public interface A2_InterfaceWithMethods {

//	We can not create a method with body in interface (wait but there is some exceptions)
	
//	public void methodWithBody() {
//		
//	}
	
	
//	In interface we can create only body less method  (wait but there is some exceptions)
	public void methodWithoutBody(); //non-static method
	
	
	
//	Methods in Java
//		* static or non-static 
//		* parameter or without parameter
//		* return type or without return type
	
	
//	In interface we can not create static method without body.
//	static method in interface should have body (exception 1)
	
//	public static void methodWithoutBodyStatic();
	
	public static void methodWithBodyStatic() {
		
	}
	
//	parameterized method
	
	public void nonStaticMethodWithParameter(int a);
	
	public static void staticMethodWithParameter(int a) {
		
	}
	
//	Return type method
	
	public int nonStaticWithReturnType();
	
	static public int staticWithReturnType() {
		return 0;
	}

}
