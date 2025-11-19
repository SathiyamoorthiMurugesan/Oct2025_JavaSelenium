package test_SwitchCase;

public class SwitchPractice2 {

	public static void main(String[] args) {
		SwitchPractice2 obj = new SwitchPractice2();
		obj.giveTips(30);
        obj.FoodMenu("Briyani");		

	}
	
	public void giveTips(int amt) {
		switch(amt) {
		case 20:
			System.out.println(20);
			break;
		case 30:
			System.out.println(30);
            break;
		case 40:
			System.out.println(40);
			break;
		case 50:
			System.out.println(50);
			break;
		default:
			System.out.println(100);
	
		}
		
	}
	
	public void FoodMenu(String food) {
		
		switch(food) {
		case "Fried Rice":
			System.out.println("Fried Rice");
			break;
		case "Noodles":
			System.out.println("Noodles");
            break;
		case "Briyani":
			System.out.println("Briyani");
			break;
		case "Parrota":
			System.out.println("Parrota");
			break;
		default:
			System.out.println("Dosa");
	
		}
		
	}

}
