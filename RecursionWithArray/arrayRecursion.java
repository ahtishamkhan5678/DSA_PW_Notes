package RecursionWithArray;

public class arrayRecursion {
	
	// making method of printArray;
	public static void printArray(int[] arr, int idx) {
		
		// base case of it;
		if(idx == arr.length) {
			return;
		}
		
		// self work;
		System.out.println(arr[idx]);
		
		// recursion work;
		printArray(arr,idx+1);
	
		
	}
	
	
	
	
	// we have print given array element by using recursion;
	public static void main(String[] args) {
		// define arr ;
		int[] arr = {5,4,3,2,1};
		
		printArray(arr,0);
	}

}
