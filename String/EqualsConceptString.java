package String;

public class EqualsConceptString {
	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hello";
		String s3 = new String("hello");
		System.out.println(s==s1);// true;
		System.out.println(s==s3);// false;
		
		// correct way;
		
		System.out.println(s.equals(s3));// false;
		
	}
}
