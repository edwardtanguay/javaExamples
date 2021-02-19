import lib.HelperTools;

public class Main {
	public static void main(String[] args) {
		String[] names = { "Ajeet", "Steve", "Rick", "Becky", "Mohan" };
		String[] sortedNames = {};
		HelperTools ht = new HelperTools();
		sortedNames = ht.bubbleSort(names);
		for (int i = 0; i < sortedNames.length; i++) {
			System.out.println(sortedNames[i]);
		}
	}
}