package LinkedList;

public class Display_LL_With_Recursive {
	
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
		
		// connection ;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		//function displayRecursively;
		
		display(a);
	}
	public static void display(Node head) {
		if(head == null) return ;
		System.out.print(head.data + " ");
		display(head.next);
		
	}
}
