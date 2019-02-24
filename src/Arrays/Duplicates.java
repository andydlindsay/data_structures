package Arrays;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		
		Utility utility = new Utility();

		int[] input = new int[10];
		for (int i = 0; i < input.length; i++) {
			input[i] = i;
		}
		utility.printIntArray("input", input);
		
		System.out.println(containsDupes(input));
		System.out.println(dupes(input));
		
		for (int i = 0; i < input.length; i++) {
			input[i] = i;
		}
		input[4] = 5;
		utility.printIntArray("input", input);
		
		System.out.println(containsDupes(input));
		System.out.println(dupes(input));
	}
	
	// O(N) linear time using absolute values
	public static boolean dupes(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[Math.abs(array[i])] < 0) {
				return true;
			}
			array[Math.abs(array[i])] = -array[Math.abs(array[i])];
		}
		
		return false;
	}
	
	// O(NlogN) because the array is sorted (NlogN) and then checked (N)
	public static boolean containsDupes(int[] array) {
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			if (i + 1 < array.length && array[i] == array[i + 1]) {
				return true;
			}
		}
		
		return false;
	}

}
