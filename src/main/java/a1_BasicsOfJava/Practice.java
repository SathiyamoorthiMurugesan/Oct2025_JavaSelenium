package a1_BasicsOfJava;

public class Practice {

	int aa = 20;
	static int bb = 30;

	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.buySoap();
		obj.buySoapAndReturnAmount();

		obj.buyShampooFromBalanceAmount(50);
		int a = 30;
		obj.buyShampooFromBalanceAmount(a);

		obj.buyShampooFromBalanceAmount(obj.aa);
		obj.buyShampooFromBalanceAmount(bb);

		obj.buyShampooFromBalanceAmount(obj.buySoapAndReturnAmount());

		obj.buyChoco(obj.buySoapAndReturnAmount());

		obj.buyChips(obj.buySoapAndReturnAmount());

		int returnAmount = obj.buySoapAndReturnAmount(); // int returnAmount = 10;

		obj.buyShampooFromBalanceAmount(returnAmount);

		obj.buyChoco(returnAmount);

		obj.buyChips(returnAmount);
		
		int sweetAmount = obj.buySweets(100); // int sweetAmount = 100;
		
		bb = obj.buySweets(100); // int sweetAmount = 100;
	}

	public void buySoap() {
		System.out.println("bought soap");
	}

	public int buySoapAndReturnAmount() {
		System.out.println("Bought Soap");
		return 10;
	}

	public void buyShampooFromBalanceAmount(int balanceAmount) {
		System.out.println("Bought shampoo");
	}

	public void buyChoco(int amount) {
		System.out.println("hello");
		
	}

	public void buyChips(int amount) {
		System.out.println("Hiii");
	}
	
//	static method
//	non-static 
//	parameterized
//	non-parameterized
	
	public int method1() {
		return 0;
	}
	
	public static String method2() {
		return null;
	}
	
	public char method3(int abc) {
	
		return 'a';
	}
	
	public boolean method4(String abc) {
		
		return false;
	}
	
	public int buySweets(int abc) {
		int x = 20;
		int y = abc + x;
//		return 10;
//		return x;
//		return y;
//		return abc;
		
		Practice obj = new Practice();
//		return obj.aa
//		return bb;
//		return obj.method1();
		
		bb = abc;
		
		return y;
	}
	

}
