package Arrays;

import java.util.List;

public class Utility {
	
	public void printIntArray(String title, int[] array) {
		System.out.println(title);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void printStrArray(String title, String[] array) {
		System.out.println(title);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void printList(String title, List<String> list) {
		System.out.println(title);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
	}

}
