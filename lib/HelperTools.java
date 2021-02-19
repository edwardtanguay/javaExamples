package lib;

public class HelperTools {
	public String[] bubbleSort(String[] names) {
		String temp;
		System.out.println("Strings in sorted order:");
		for (int j = 0; j < names.length; j++) {
			for (int i = j + 1; i < names.length; i++) {
				if (names[i].compareTo(names[j]) < 0) {
					temp = names[j];
					names[j] = names[i];
					names[i] = temp;
				}
			}
		}
		return names;
	}
}