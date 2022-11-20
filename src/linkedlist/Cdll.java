package linkedlist;

public class Cdll {
	static Node head,tail;
	static class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	//method for forming doubly linked list
	
	public static Cdll form(Cdll doublycl,int data) {
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
			tail=new_node;
			new_node.prev=head;
			new_node.next=head;
			return doublycl;
		}
		else {
			tail.next=new_node;
			new_node.prev=tail;
			new_node.next=head;
			head.prev=new_node;
			tail=new_node;
			return doublycl;
		}
		
	}
	
	
	
	//method for inserting first
	public static void inserfir(Cdll doublycl,int data) {
		Node new_node=new Node(data);
		if(head==null) {
		  head=new_node;
		  new_node.prev=new_node;
		  new_node.next=new_node;
		  tail=new_node;
		}
		else {
			new_node.prev=tail;
			new_node.next=head;
			head.prev=new_node;
			tail.next=new_node;
			head=new_node;
			System.out.println("new node is added successfully at the beginning");
		}
	}
	//method for printing linked list
	
	
	public static void prin(Cdll doublycl) {
		Node last=head;
		System.out.print("doubly circular linked list in forward direction : ");
		while(last.next!=head) {
			System.out.print(last.data+" ");
			last=last.next;
		}
		System.out.println(last.data+" ");
	}
	
	//method for printing the linked list backwards
	public static void prinrev(Cdll doublycl) {
		Node temp=tail;
		System.out.print("doubly circular linked list in reverse direction : ");
		while(temp.prev!=tail) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cdll doublycl=new Cdll();
		doublycl=form(doublycl,1);
		doublycl=form(doublycl,2);
		doublycl=form(doublycl,3);
		doublycl=form(doublycl,4);
		prin(doublycl);
		prinrev(doublycl);
		inserfir(doublycl,0);
		prin(doublycl);
		prinrev(doublycl);

	}

}
