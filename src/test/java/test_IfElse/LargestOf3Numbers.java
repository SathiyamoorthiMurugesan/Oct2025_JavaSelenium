package test_IfElse;

public class LargestOf3Numbers {
	
	static int a = 10;
	static int b = 50;
	static int c = 30;

	public static void main(String[] args) {
//		
//		if(a>b) {
//			
//			if(a>c) {
//				System.out.println("a is bigger");
//			}
//			else {
//				System.out.println("c is bigger");
//			}
//		}
//		else if (b>c) {
//			System.out.println("b is bigger");
//		}
      
		if (a>b && a>c) {
			System.out.println("a is bigger");
		}
		else if (b>c) {
			System.out.println("b is bigger");
		}
		else {
			System.out.println("c is bigger");
		}
	}

}
