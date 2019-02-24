
public class ArrayPractice {

	public static void main(String[] args) {
		
		consoleLog("Smacks up");
		
		int[] intArray = new int[5];
		intArray[0] = 12;
		intArray[1] = 5;
		intArray[2] = 11;
		intArray[3] = 10;
		intArray[4] = 7;
		
		for (int i = 0; i < intArray.length; i++) {
			consoleLog(Integer.toString(intArray[i]));
		}
		
		consoleLog(intArray.toString());
		
	}
	
	public static void consoleLog(String msg){
		System.out.println(msg);
	}

}
