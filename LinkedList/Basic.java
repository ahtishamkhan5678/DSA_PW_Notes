package LinkedList;

public class Basic {
///// List Node  Below  Start here--------------------------------------->	
	public static class Node {
		
		int data; // value;
		Node next; // address of next node ;
		
		// Making contructor below here;
		Node(int data){
			this.data = data;
		}
		
	}
///// List Node  End  here--------------------------------------->		
	
	public static void main(String[] args) {
		
		// creating node object below here;
		
		Node a = new Node(5); // head 
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(8);
		Node e = new Node(10); // tail
		
		// making connection between them below here!
		
		a.next = b; // [5, address of b] == 5->3
		b.next = c; // [3, address of c] == 5 -> 3 -> 4;
		c.next = d; // [4, address of d] == 5 -> 3 -> 4-> 8;
		d.next = e; // [8, address of e] == 5->3->4->8->10
		
		System.out.println(a.next.next.next.next.data); // 10;
		
	}
}
