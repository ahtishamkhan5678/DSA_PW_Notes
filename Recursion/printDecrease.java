package Recursion;



public class printDecrease {
	
	public static  void printNTo1(int n) {
		
		if(n==1) {
			System.out.println(n);
			return;
		}
		
		
		System.out.println(n);
		printNTo1(n-1);
	
		
		
	}
	
	
    public static void main(String[] args) {
		 // taking input from user ;
    	
    	 int n = 6;
    	 printNTo1(n);
    	
	}
}
