package RecursionWithArray;

public class SumRecursion {
	
	public static int printSum(int[] arr, int idx) {
		
		// base case;
		if(idx == arr.length) {
			return 0;
		}
		int smallAns = printSum(arr,idx+1);
		
		return arr[idx] + smallAns;
		
	}
	
	
	// print sum of array by using recursion ;
	public static void main(String[] args) {
		int[] arr = {3,5,1,6,7,55, 0, 1};
//		int[] arr = {}; // edge case;
		System.out.println(printSum(arr,0));
	}
}
