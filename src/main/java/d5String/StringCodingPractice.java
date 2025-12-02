package d5String;

public class StringCodingPractice {

	public static void main3(String[] args) {

//		Count each word/number 

//		I am automation tester and I Am working with Java selenium

		String myString = "1 2 3 4 5 1 2 2 1 6";

		String[] arr = myString.split(" ");

		String newWord = "";

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			if (!newWord.contains(arr[i])) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].equalsIgnoreCase(arr[j])) {
						count++;
					}
				}
				newWord = newWord + arr[i];
				System.out.println(newWord);
				System.out.println("The value " + arr[i] + " is repeating " + count + " times");
			}
		}

	}

	public static void main(String[] args) {

//		Count each word/number 

		String myString = "1 2 3 4 5 1 2 2 1";

		String[] arr = myString.split(" ");

		String[] newArr = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int k = 0; k < newArr.length; k++) {
				if (!arr[i].equalsIgnoreCase(newArr[k])) {

					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].equalsIgnoreCase(arr[j])) {
							count++;
						}
					}
				}
				newArr[k] = arr[i];
			}
			System.out.println("The value " + arr[i] + " is repeating " + count + " times");

		}

	}

	public static void main1(String[] args) {

//		Count each word/number 

		String myString = "1 2 3 4 5 1 2 2 1";

		String[] arr = myString.split(" ");

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;
				}
			}
			System.out.println("The value " + arr[i] + " is repeating " + count + " times");

		}

	}

}
