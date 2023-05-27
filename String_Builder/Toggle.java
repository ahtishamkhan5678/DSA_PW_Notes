package String_Builder;

import java.util.*;

public class Toggle {
	
	public static void main(String[] args) {
		
		// taking input in StringBuilder below;
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder(sc.nextLine());
		
//		System.out.println(str);
		
		//toggle the world ;
		
	//	helLO -> HELlo;
		
		for(int i = 0 ;i<str.length();i++) {
			
			boolean flag = true; // captial hai;
			char ch = str.charAt(i); // store here elements in ch;
			
			if(ch == ' ') {
				continue;
			}
			
			int asci = (int)ch;
			
			if(asci>=97) { // small hai;
				flag = false; 
			}
			if(flag == true) {
				asci += 32;
				char ans = (char)asci;
				str.setCharAt(i, ans);
				
			}
			else {
				asci-=32;
				char ans =(char)asci;
				str.setCharAt(i, ans);
			}
		
		}
		System.out.println(str);
	}

}
