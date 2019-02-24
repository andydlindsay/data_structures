package Arrays;

public class App {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		for (int i = 1; i < nums.length; ++i) {
			nums[i] = i;
		}
		
		// O(1) random index - constant time complexity
		int num = nums[2];
		consoleLog(Integer.toString(num));
		
		// O(N) linear search - linear time complexity
		int target = 4;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				consoleLog("Index found at " + i);
			}
		}
		
	}
	
	public static void consoleLog(String msg) {
		System.out.println(msg);
	}
	
}
