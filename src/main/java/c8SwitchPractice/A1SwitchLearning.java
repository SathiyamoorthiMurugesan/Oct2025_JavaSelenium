package c8SwitchPractice;

public class A1SwitchLearning {

	public static void main(String[] args) {

		String foodType = "Veg";

		switch (foodType) { // switch with String. You can use anything which represent a String

		case "Non Veg":
			System.out.println("Go to Biriyani shop");
			break;

		case "Veg":
			System.out.println("Go to Saravana Bhavan");
			break;

		default:
			System.out.println("Go to home and eat");

		}

//		************************ Switch using int as a condition **************************
		int number = 3;
		System.out.println("Please tell an odd number between 1 to 10: " + number);

		switch (number) {

		case 1:
			System.out.println("1");
			break;

		case 3:
			System.out.println("3");
			break;

		case 5:
			System.out.println("15");
			break;

		case 7:
			System.out.println("7");
			break;

		case 9:
			System.out.println("9");
			break;

		default:
			System.out.println("The number you said is not an odd number. Please tell an odd number between 1 to 10");
		}

		if (number == 1)
			System.out.println("1");

		if (number == 3)
			System.out.println("3");

		if (number == 5)
			System.out.println("5");

		if (number == 7)
			System.out.println("7");

		if (number == 9)
			System.out.println("9");

		if (number != 1 && number != 3 && number != 5 && number != 7 && number != 9)
			System.out.println("The number you said is not an odd number. Please tell an odd number between 1 to 10");

	}

}
