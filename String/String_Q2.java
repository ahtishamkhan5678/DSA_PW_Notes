package String;

public class String_Q2 {
	public static void main(String[] args) {
		// print all substring of given string below;
		
		String str = "abcd";
		int size = str.length();
		
		for(int i = 0; i<=size; i++) {
			for(int j =i+1;j<=size; j++) {
				System.out.print(str.substring(i,j)+ " ");
			}
			
		}
		
	}
}
