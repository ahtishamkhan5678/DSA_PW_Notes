package String_Builder;

public class Builder {
		public static void main(String[] args) {
			
			
			// declaration of StringBuilder below here!
			
			StringBuilder str = new StringBuilder("Hello");
			
//			System.out.println(str);
//			
//			// Importants function in Sb ;
//			
//			// 1: setCharAt(index,char);
//			str.setCharAt(0,'z');
//			
//			// 2: append(char,float,....);
//			str.append("Hello");
//			
//			//3: insert(index,char);
//			str.insert(2, 'y');
//			
//			
//			//4: deleteCharAt(index);
//			str.deleteCharAt(3);
			
			
			//5: reverse;
			str.reverse(); // olleH
			
			//6: delete;
			str.delete(1,4);// oH
			
			System.out.println(str);// oH
			
			
			
			
			
		}
}
