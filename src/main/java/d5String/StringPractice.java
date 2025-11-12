package d5String;

public class StringPractice {

	public static void main(String[] args) {
		String str = "Sathya";
		String str1 = "sathya";
		
//		equals or equalsIgnoreCase
//		contentEqual
//		compareTo
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.contentEquals(str1));
		
		System.out.println(str.compareTo(str1));
		
		System.out.println("a".compareTo("A"));
		
		String a = "Sathya";
		System.out.println(a.concat("+"));
	}

}
