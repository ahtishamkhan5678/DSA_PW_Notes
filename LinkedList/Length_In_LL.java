package LinkedList;

import LinkedList.Display_LL_With_Recursive.Node;

public class Length_In_LL {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		Node a  = new Node(50);
		Node b = new Node(100);
		Node c = new Node(150);
		Node d = new Node(200);
		Node e = new Node(250);
		Node f = new Node(300);
		
		// connection ;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		 length(a);
		
	}
	public static void  length(Node a) {
		int count = 0;
		while(a!=null) {
			count++;
		a=a.next;
	 }
		System.out.println(count);

	}
	
	
	
}
