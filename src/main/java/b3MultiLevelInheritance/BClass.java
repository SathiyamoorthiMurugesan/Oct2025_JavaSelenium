package b3MultiLevelInheritance;

public class BClass implements AInterface {
	
	int bA = 10;
	static int bB = 20;
	
	
	public void methodB1() {
		
	}
	
	public static void methodB2() {
		
	}

	@Override
	public void methodA1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		BClass obj = new BClass();
		obj.methodA1();
		obj.methodA2();
		obj.methodB1();
		
	}

}
