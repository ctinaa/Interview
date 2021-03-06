public class Main {
	
	// Starting out easy
	public static void main(String[] args) {
     System.out.println(countWay(10));
	}
   
   public static int countWay(int n) {
   	if (n == 0)
   		return 1;
   	if (n < 0)
   		return 0;
   	return countWay(n - 1) + countWay(n - 2)  + countWay(n -3);
   }
 

	// Return the smallest number in an integer array
	public static int getSmallest(int[] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("You passed an empty array.");
		
		int smallest = array[0];
		for(int i = 1; i < array.length; i++) {
			smallest = Math.min(smallest, array[i]);
		}
		return smallest;
	}
	
	// Return the largest number in an integer array
	public static int getLargest(int[] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("You passed an empty array.");
		
		int largest = array[0];
		for(int i = 1; i < array.length; i++) {
			largest = Math.min(largest, array[i]);
		}
		return largest;
	}
	
	// unique character in String
	public static boolean isUnique(String word) {
		int[] chars = new int[256];
		for(int i = 0; i < word.length(); i++) {
			int index = word.charAt(i);
			chars[index]++;
			if(chars[index] > 1)
				return false;
		}
		
		return true;
	}
	
	// assuming that whitespaces and case sensitive
	public static boolean permutation(String w1, String w2) {
		// if the two word aint the same then they can't be a permutation of
		// each other
		if(w1.length() != w2.length())
			return false;
		
		// building up a stock of characters
		int[] chars = new int[256];
		for(int i = 0; i < w1.length(); i++)
			chars[w1.charAt(i)]++;
			
		for(int i = 0; i < w2.length(); i++) {
			int index = w2.charAt(i);
			chars[index]--;
			if(chars[index] < 0)
				return false;
		}

		return true;
	}
	
	// binary search
	public static boolean binarySearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (high - low) / 2 + low;
			if (arr[mid] > x) {
				// move the low
				high = mid -1;
			} else if (arr[mid] < x) {
				// move the high
				low = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}
	
}