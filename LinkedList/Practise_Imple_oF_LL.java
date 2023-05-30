package LinkedList;

public class Practise_Imple_oF_LL {
		
	// creat node class;
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			
		}
	}
	
	public static class linkedlist{
		Node head = null;
		Node tail = null;
	
		void insertAtEnd(int data) {
			Node temp = new Node(data);
			
			if(head == null) {
				
				head = temp;
			}
			else {
				
				tail.next = temp;
			}
			
			tail = temp;
		}
		
		void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(4);
		ll.insertAtEnd(7);
		ll.display();
	}
}
