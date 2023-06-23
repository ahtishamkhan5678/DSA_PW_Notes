package RecursionWithArray;

public class maxvalueRecursion {
	
	static int maxNo(int[] arr,int idx) {
		
		if(idx == arr.length-1) {
			return arr[idx];
		}
		
		int smallAns = maxNo(arr,idx+1);
		
		return Math.max(smallAns, arr[idx]);
		
	}
	// we have print max value from given array by using recursion
	public static void main(String[] args) {
		int[] arr = {50,45,6,43,8,4};
		
		System.out.println(maxNo(arr,0));
	}

}
