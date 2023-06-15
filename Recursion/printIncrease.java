package Recursion;



public class printIncrease {
	
	public static  void print1ToN(int n) {
		
		if(n==1) {
			System.out.println(n);
			return;
		}
		
		print1ToN(n-1);
		System.out.println(n);
		
	
		
		
	}
	
	
    public static void main(String[] args) {
		 // taking input from user ;
    	
    	 int n = 6;
    	 print1ToN(n);
    	
	}
}
