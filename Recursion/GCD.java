package Recursion;

public class GCD {
    public static void main(String[] args) {
		// Solve GCD problem using Eculid's Alog;
    	int x = 24 ;
    	int y = 15 ;
    	
    	System.out.println(gcD(x,y));
    	System.out.println(iGCD(x,y));
	}
    public static int gcD(int x , int y) {
    	if(y==0) return x;
    	
    	return gcD(y,x%y);
    	
    }
    
    public static int iGCD(int x , int y ) {
      // by long divison method
    	while( x% y != 0) {
    		int rem  = x%y;
    		x = y;
    		y = rem;
    	}
    	return y;
    }
}
