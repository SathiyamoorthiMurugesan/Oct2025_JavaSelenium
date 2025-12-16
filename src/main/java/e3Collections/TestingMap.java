package e3Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestingMap {

	static HashMap<String, Integer> marks = new HashMap<String, Integer>();
	static {
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);
		marks.put("Chemistry", 75);
		marks.put("Maths", 95);
	}

	public static void main(String[] args) {
//		System.out.println(marks);
		CheckKeyAndValueInMap("Bio", 75);
	}

	public static void CheckKeyAndValueInMap(String subject, Integer subMarks) {
		Set<Entry<String, Integer>> AllEntries = marks.entrySet();
		Iterator<Entry<String, Integer>> ite = AllEntries.iterator();

		boolean flag = false;

		if (!marks.keySet().contains(subject)) {
			System.out.println("The given key " + subject + " is not availble");
		}

		else if (!marks.values().contains(subMarks)) {
			System.out.println("The given value " + subMarks + " is not availble");
		} else {

			while (ite.hasNext()) {
				Entry<String, Integer> eachEntry = ite.next();

				if (eachEntry.getKey() == null) {
					if (eachEntry.getValue() == null) {
						System.out.println("The Key \"null\" has the value \"null\".");
						flag = true;
					} else if (eachEntry.getValue().equals(subMarks)) {
						System.out.println("Yes, the Key " + subject + " has value " + subMarks + ".");
						flag = true;
					}
				}

//				else if (eachEntry.getKey().equalsIgnoreCase(subject)) {
//					if (eachEntry.getValue() == null) {
//						System.out.println("The " + subject + " has the value \"null\".");
//						flag = true;
//					} else if (eachEntry.getValue().equals(subMarks)) {
//						System.out.println("Yes, the Key " + subject + " has value " + subMarks + ".");
//						flag = true;
//					}
//				}

				else if (eachEntry.getKey().equalsIgnoreCase(subject)) {
//					System.out.println(eachEntry.getValue() != null);
//					System.out.println(!eachEntry.getValue().equals(subMarks));
					if (eachEntry.getValue() != null && !eachEntry.getValue().equals(subMarks)) {
						System.out.println("No, the Key " + subject + " does not have the value " + subMarks + ".");
					} else if (eachEntry.getValue() == null) {
						System.out.println("The " + subject + " has the value \"null\".");
						flag = true;
					} else if (eachEntry.getValue().equals(subMarks)) {
						System.out.println("Yes, the Key " + subject + " has value " + subMarks + ".");
						flag = true;
					}
				}

//			else {
//				System.out.println(
//						"Either the Key is not available or the value is not available or the key value pair is not available");
//			}
			}
//			System.out.println(flag);

			if (flag == false)
				System.out.println(
						"Either the Key is not available or the value is not available or the key value pair is not available");
		}
	}

	public static void main2(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);
		marks.put("Chemistry", 75);
		marks.put("Maths", 95);

		System.out.println(marks);

		System.out.println(marks.keySet());
		System.out.println(marks.values());
		System.out.println(marks.entrySet());

		Set<Entry<String, Integer>> AllEntries = marks.entrySet();
		Iterator<Entry<String, Integer>> ite = AllEntries.iterator();
		while (ite.hasNext()) {
//			System.out.println(ite.next());
//			System.out.println(ite.next().getKey());
//			System.out.println(ite.next().getValue());
			Entry<String, Integer> eachEntry = ite.next();
//			System.out.println(eachEntry.getKey());
//			System.out.println(eachEntry.getValue());

//			Check the map contains key "English" and its respective value is "75"
			if (eachEntry.getKey() == null) {
				if (eachEntry.getValue() == null) {
					System.out.println("The Key has the value as null");
				} else if (eachEntry.getValue().equals(95))
					System.out.println("Yes, the Key English has value 75");
			}

			else if (eachEntry.getKey().equalsIgnoreCase("Maths")) {
				if (eachEntry.getValue() == null) {
					System.out.println("The Key has the value as null");
				} else if (eachEntry.getValue().equals(95))
					System.out.println("Yes, the Key English has value 75");
			}

		}

	}

	public static void main1(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);
		marks.put("Chemistry", 75);
		marks.put("Maths", 95);

		System.out.println(marks);

//		if you want to check the any specific key is present in the keys
//		1) you need to all the keys
		Set<String> allKeys = marks.keySet(); // Set of keys
		for (String eachKey : allKeys) {
			System.out.println(eachKey);
		}

//		Similarly you can check for Values as well
		Collection<Integer> allValues = marks.values(); // Collection of values
		for (Integer eachVal : allValues) {
			System.out.println(eachVal);
		}

		Set<Entry<String, Integer>> allKeyAndValue = marks.entrySet(); // key - value mapping;
		System.out.println(allKeyAndValue);
		for (Entry<String, Integer> each : allKeyAndValue) {
//			System.out.println(each.getKey());
//			System.out.println(each.getValue());

			if (each.getKey() != null && each.getKey().equals("English")) {
				System.out.println(each.getValue());
			}
		}

		System.out.println("Using Iterator to go through the key value pair simultaniously");

		Iterator<Entry<String, Integer>> ite = allKeyAndValue.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next());

			Entry<String, Integer> eachEntry = ite.next();
			if (eachEntry.getKey() != null && eachEntry.getKey().equalsIgnoreCase("English")) {
				System.out.println(eachEntry.getValue());
			}
		}

	}

	public void test() {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
//		Set<Entry<String, Integer>>  allMarksAndValues = marks.entrySet();
		Set<Map.Entry<String, Integer>> allMarksAndValues = marks.entrySet();

		System.out.println(allMarksAndValues);

		Iterator<Entry<String, Integer>> ite = allMarksAndValues.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next().getKey());
//			System.out.println(ite.next().getValue());
//		}

//		while(ite.hasNext()) {
//			Entry<String, Integer> eachEntry = ite.next();
//			System.out.println(eachEntry.getKey());
//			System.out.println(eachEntry.getValue());
//		}

		while (ite.hasNext()) {
			Entry<String, Integer> eachEntry = ite.next();
			if (eachEntry.getKey() != null && eachEntry.getKey().equalsIgnoreCase("English")) {
				System.out.println(eachEntry.getValue());
			}
		}
	}

}
