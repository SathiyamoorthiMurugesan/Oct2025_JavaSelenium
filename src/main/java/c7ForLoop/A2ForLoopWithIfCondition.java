package c7ForLoop;

public class A2ForLoopWithIfCondition {

	public static void main(String[] args) {

		int soapAmount = 30;

		System.out.println("************* For loop without break *************");
		int i;
		for (i = 10; i <= 50;) {

			if (i == soapAmount) {
				System.out.println("Buy the soap");
			}
//			System.out.println(i);
			i = i + 10;
		}
		System.out.println(i);

		System.out.println("************* For loop with break *************");

		int k;
		for (k = 10; k <= 50;) {

			if (k == soapAmount) {
				System.out.println("Buy the soap");
				break;
			}
//			System.out.println(k);
			k = k + 10;
		}
		System.out.println(k);

		System.out.println("************* For loop with if and else **************");

		for (int j = 1; j <= 10; j++) {
			
			if(j%2==0) {
				System.out.println(j+" is an even number");
			}
			else 
				System.out.println(j+" is an odd number");
		}
	}

}
