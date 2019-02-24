package Arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String inputOne = "Terry";
		String inputTwo = "yTrer";
		
		System.out.println(isAnagram(inputOne, inputTwo));
		
		inputOne = "Gonzo";
		inputTwo = "Frankie";
		
		System.out.println(isAnagram(inputOne, inputTwo));
		
		inputOne = "restful";
		inputTwo = "fluster";
		
		System.out.println(isAnagram(inputOne, inputTwo));

	}
	
	// O(NlogN) + O(N) = O(NlogN)
	private static boolean isAnagram(String wordOne, String wordTwo) {
		String[] wordOneArray = wordOne.split("");
		String[] wordTwoArray = wordTwo.split("");
		
		if (wordOneArray.length != wordTwoArray.length) return false;
		
		Arrays.sort(wordOneArray);
		Arrays.sort(wordTwoArray);
		
		for (int i = 0; i < wordOneArray.length; i++) {
			if (!wordOneArray[i].equals(wordTwoArray[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void print(String title, String[] array) {
		System.out.println(title);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
