package test_String;

public class Practice {

	public static void main(String[] args) {

		String str = "I Know You know We know";

		String[] strArr = str.toLowerCase().split(" "); // ["i","know","you","know","we","know"]

		String sentence = "";

		for (int i = 0; i < strArr.length; i++) {
			int count = 1;

			if (!sentence.contains(strArr[i])) {
				for (int j = i + 1; j < strArr.length; j++) {
					if (strArr[i].equals(strArr[j])) {
						count++;
					}
				}
				System.out.println("The Word " + strArr[i] + " repeating " + count + " times");

				sentence = sentence + strArr[i];

			}
		}
	}

}
