package Arrays;

public class ReservoirSampling {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		int n = 100000;
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = i;
		}
		
		int k = 10;
		utility.printIntArray("result",reservoirSample(input, k));	
	}
	
	// O(N) - linear time
	// copy the first k items in the original array to ensure that valid samples get returned
	// then iterate over the original array from k to the end, randomly sampling and replacing
	public static int[] reservoirSample(int[] array, int k) {
		Utility utility = new Utility();
		
		int[] samples = new int[k];
		
		for (int i = 0; i < k; i++) {
			samples[i] = array[i];
		}
		
		for (int i = k + 1; i < array.length; i++) {
//			if (utility.genRandom() < (k * 1.0 / i)) {
//				samples[utility.genRandom(k)] = array[i];
//			}
			int j = utility.genRandom(i + 1);
			if (j < k) {
				samples[j] = array[i];
			}
		}
		
		return samples;
	}

}
