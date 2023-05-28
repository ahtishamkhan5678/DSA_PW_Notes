package String_Builder;

public class Palindrome {
	public static void main(String[] args) {
		
		// by simple way;
		
		String str = "abc";
//		
//		StringBuilder gtr = new StringBuilder(str);
//		
//		gtr.reverse();
//		
//		String s = gtr + "";
//		
//		if(str.equals(s)) {
//			
//			System.out.println("Palidrome hai ");
//			
//		}
//		else {
//			System.out.println("nhi hai");
//		}
//		
//		
		
		// by two pointer;
		
		int i = 0 ;
		int j = str.length()-1;
		
		boolean flag = true;
		
		while(i<j) {
			
			if(str.charAt(i)!=(str.charAt(j))) {
				
				flag = false;
				break;
				
			}
			i++;
			j--;
		}
		if(flag==true) {
		    	
		    	System.out.println("Palidrome hai ");
		}
		else {
		    	System.out.println("nhi hai ");
		}
		
	}

}
