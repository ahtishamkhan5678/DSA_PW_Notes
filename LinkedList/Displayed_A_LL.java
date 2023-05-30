package LinkedList;

public class Displayed_A_LL {
	
	public static class Node{
		int data; // value;
		Node next;// add of next node;
		
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
		
		
		// make a head as temp;
		Node temp = a;
		
		// when we know the size ; but it is not happend in real we not know about the size;
		
//		for(int i = 1; i<=5; i++) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//			
//		}
		
		// optimise way;
		while(temp!=null) {  // logic for printing the linkedlist;
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
}
