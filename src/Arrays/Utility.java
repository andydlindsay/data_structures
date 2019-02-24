package Arrays;

import java.util.List;
import java.util.Random;

public class Utility {
	
	public void printIntArray(String title, int[] array) {
		System.out.println(title);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void printIntArray(int[] array) {
		System.out.println("int array contents:");
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
	
	public void printStrArray(String[] array) {
		System.out.println("string array contents:");
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
	
	public void printList(List<String> list) {
		System.out.println("list contents:");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	// returns a uniformly distributed integer between 0 and bound
	public int genRandom(int bound) {
		return new Random().nextInt(bound);
	}
	
	public double genRandom(double bound) {
		return new Random().nextDouble() * (bound);
	}
	
	public double genRandom() {
		return new Random().nextDouble();
	}


}
