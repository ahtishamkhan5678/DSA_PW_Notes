package LinkedList;

import LinkedList.Displayed_A_LL.Node;

public class RemoveLinkedList {

	public static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	
	 public static void main(String[] args) {
		//making node 
			Node a = new Node(5); // head;
			Node b = new Node(4);
			Node c = new Node(8);
			Node d = new Node(10);
			Node e = new Node(11); 
			
			// connection below here!
			
			a.next = b;
			b.next = c;
			c.next = d;
			d.next = e;
			display(a);
			
			a=removeNthFromEnd(a,5);
			
			display(a);
	 }
	 public static void display(Node a) {
		 Node temp = a;
		 while(temp!=null) {
			 System.out.print(temp.data + " ");
				temp = temp.next;
		 }
			System.out.println(); 
	 }
	 
	 public static Node removeNthFromEnd(Node head, int n) {
		 Node slow = head;
		 Node fast = head;
		 
		 for(int i = 1; i<=n; i++) {
			 fast = fast.next;
		 }
		 
		 //important point;
		 if(fast==null) {
			 head = head.next;
			 return head;
		 }
		 
		 
		 while(fast.next!=null) {
			 slow = slow.next;
			 fast = fast.next;
		 }
		 slow.next=slow.next.next;
		 return head;
	 }
}
