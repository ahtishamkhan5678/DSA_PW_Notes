package String;

public class String_int_char {
	public static void main(String[] args) {
		// how we add in string without using concat;
		
//		String str1 = "abc";
//		str1 += "r"; // abcr;
//		str1 +=10; // abcr10;
//		
//		System.out.println(str1);
		
		System.out.println("abc"+"r"+10);//abcr10
		System.out.println("abc"+"r"+10+30);//abcr1030;
		System.out.println("abc"+"r"+(10 + 30));//abcr40;
		System.out.println(10+30+"xyz");
		
	}
}
