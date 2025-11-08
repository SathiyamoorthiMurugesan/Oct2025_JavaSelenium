package b3MultiLevelInheritance;

public class CClass extends BClass {
	int cA = 10;
	static int cB = 20;

	public void methodC1() {

	}

	public static void methodC2() {

	}

	public static void main(String[] args) {

		CClass obj = new CClass();
//		I can access non-static methods from AInterface, BClass and CClass;
	
		BClass obj1 = new BClass();
//		I can access non-static methods from AInterface and BClass;
		}

}
