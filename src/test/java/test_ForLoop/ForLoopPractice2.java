package test_ForLoop;

public class ForLoopPractice2 {
	
	//static int i;

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {          // parent → rows
		    for (int j = 1; j <= 5; j++) {      // child → columns
		        System.out.print(j + " ");
		    }
		    System.out.println();               // move to next line
		}
		
//		for (i = 1; i <= 5; i++) {
//		    for (int j = 1; j <= 5; j++) {
//		        if (j == i) break;  // stops child loop
//		        System.out.print(j);
//		    }
//		    System.out.println();
//		}
//		
//		System.out.println("i is:" + i);  //But we can use the loop variable outside the loop, only if it is declared in class level

//		System.out.println("j is:" + j);    
		 
		
//right angle triangle	
//		for(int i=5;i>=1;i--) {           //i = row number
//			for(int j=1; j<=i; j++) {     //Row number and star number is same in each row. so loop must run i times
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//pyramid pattern
		
//		for(int i=1; i<=5; i++) {                 //row count = 5
//			for(int j= 1; j<=5-i;j++) {           //for space -> 5-1 = 4 spaces in 1st line, 5-2 = 3 spaces in 2nd line
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		
//hallow square pattern
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<=5;j++) {
//				if(i==1||j==1||i==5||j==5) {
//				System.out.print("*");
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		

//right diagonal
		
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5;j++) {
				if(j==i) {
				System.out.print("*");
				break;
				}
				else {
					System.out.print(" ");
					}
			}
			System.out.println();
		}
		
//left diagonal       //break statement will break the inner for loop once the condition is satisfied.
		
//		for(int i=5; i>=1;i--) {
//		for(int j=1; j<=5;j++) {
//			if(j==i) {
//			System.out.print("*");
//			break;
//			}
//			else {
//				System.out.print(" ");
//				}
//		}
//		System.out.println();
//	}
	}

}


