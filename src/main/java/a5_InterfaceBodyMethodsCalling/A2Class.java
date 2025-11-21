package a5_InterfaceBodyMethodsCalling;

public class A2Class implements A1Interface {

	public static void main(String[] args) {
//		methodA();
		A2Class obj = new A2Class();
		obj.methodA();
		
		A1Interface.methodB();
		
//		methodC();
//		obj.methodC();
		
		obj.methodD();
		obj.methodE();
	}

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodE() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}

}
