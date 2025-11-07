package a7_InheritanceWithAbstract;

public class A4Class extends A3AbstractClass {

	@Override
	public void methodA32() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		A3AbstractClass.methodA33();
		
		A4Class obj = new A4Class(); 
		// 1. A4class's non-static members are copied and stored in heap memory
		// 2. Constructor calling will happen (in this case, default constructor of A4Class is called)
		// 3. A4Class's parent class non-static members also copied and stored in heap memory
		
		obj.methodA31();
		obj.methodA32();
		
		
	}
	
	

}
