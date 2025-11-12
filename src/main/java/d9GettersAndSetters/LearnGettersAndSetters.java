package d9GettersAndSetters;

public class LearnGettersAndSetters {

	private int a = 10;

	private String myName = "Sathya";

	public static void main(String[] args) {

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}

class ABC {
	LearnGettersAndSetters obj = new LearnGettersAndSetters();
	int valueOfA1;
	
	public void method1() {
//		System.out.println(obj.a);
		System.out.println(obj.getA());
		int valueOfA = obj.getA();
		valueOfA1 = obj.getA();
	}
	
	public void method2() {
		obj.setA(100);
		System.out.println(obj.getA());
	}
	
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.method1();
		
		abc.method2();
		
		
	}

}