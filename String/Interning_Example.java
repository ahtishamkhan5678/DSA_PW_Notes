package String;

public class Interning_Example {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		s2 = "Cello";
		System.out.println(s2);
	}
}
