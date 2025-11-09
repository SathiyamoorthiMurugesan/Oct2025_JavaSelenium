package test_interfaceInheritence;

public class Test_ChildClass implements Test_ChildInterface {

	public static void main(String[] args) {
		Test_ChildClass obj = new Test_ChildClass();
		obj.methodc1();
		obj.method1();   //non-static method from ParentInterface. because ChildInterface follows ParentInterface
		Test_ChildInterface.methodc2();   //static method from child interface
		
	}

	@Override
	public void method1() {                       
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodc1() {
		// TODO Auto-generated method stub
		
	}

}
