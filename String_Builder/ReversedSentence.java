package String_Builder;

public class ReversedSentence {
    
	public static void main(String[] args) {
		
		String sen = "I am a coder and My Name is Mohammad  Ahtisham";
		
		String ans = "";
		
		StringBuilder sb = new StringBuilder("");
		
		// traverse on original str;
		
		for(int i = 0 ; i<sen.length(); i++) {
			char ch = sen.charAt(i); // store in ch;
			
			if(ch !=' ') {
				sb.append(ch);
			}
			else {
				sb.reverse();
				ans +=sb;
				ans +=" ";
				sb = new StringBuilder("");
			}
		}
		sb.reverse();
		ans += sb;
		System.out.println(ans);
		
	}
}
