package Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] input = new int[20];
		int startingNum = 10;
		for (int i = 0; i < input.length; i++) {
			input[i] = i + startingNum;
		}	
		print("input", input);
		
		int[] output = reverse(input);
		print("output", output);
		
		reverseInPlace(input);
		print("input after reverseInPlace()", input);
		
		reverseWithPointers(input);
		print("input after reverseWithPointers()", input);
		
	}
	
	public static void reverseWithPointers(int[] array) {
		int start = 0;
		int end = array.length - 1;
		
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			start++;
			end--;
		}
	}
	
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			result[array.length - i - 1] = array[i];
		}
		return result;
	}
	
	public static void reverseInPlace(int[] array) {
		int stop = Math.floorDiv(array.length, 2);
		for (int i = 0; i < stop; i++) {
			int endIndex = array.length - i - 1;
			int temp = array[i];
			array[i] = array[endIndex];
			array[endIndex] = temp;
		}
	}
	
	public static void print(String title, int[] array) {
		System.out.println(title);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
