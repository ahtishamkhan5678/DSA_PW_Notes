package Topic_Array;

public class Reversed_By_Swap {
	
	public static void main(String[] args) {
        // given array;
        int[] arr = {1, 3, 4, 5, 6, 8, 10};
        
        // reversed array using swap method
        int n = arr.length;
        
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        
        // printing reversed array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
