package linkedlist;

public class Dll {
	Node head,tail=null;
	static class Node{
		int data;
		Node prev;
		Node forw;
		public Node(int data) {
			this.data=data;
		}
	}
	
	//method for forming Doubly linked list
	public static Dll form(Dll doublyll,int data) {
		Node new_node=new Node(data);
		if(doublyll.head==null) {
		doublyll.head=new_node;
		doublyll.tail=new_node;
		new_node.prev=null;
		new_node.forw=null;
		return doublyll;
		}
		else {
			doublyll.tail.forw=new_node;
			new_node.prev=doublyll.tail;
			doublyll.tail=new_node;
			new_node.forw=null;
		}
		return doublyll;
		
	}
	
	//method for inserting first in a doubly linked list
	
	public static void inserfir(Dll doublyll,int data) {
		Node new_node=new Node(data);
		if(doublyll.head==null) {
			new_node.prev=null;
			new_node.forw=null;
		}
		else {
			Node temp=doublyll.head;
			doublyll.head=new_node;
			new_node.prev=null;
			new_node.forw=temp;
		}
		System.out.println("new node is successfully inserted at the first position");
	}
	
	
	
	
	//method for inserting last in a doubly linked list
	public static void inserla(Dll doublyll,int data) {
		Node new_node=new Node(data);
		if(doublyll.head==null) {
			doublyll.head=new_node;
			new_node.prev=null;
			new_node.forw=null;
		}
		else {
			
			doublyll.tail.forw=new_node;
			new_node.prev=doublyll.tail;
			doublyll.tail=new_node;
			new_node.forw=null;
		}
		System.out.println("new node at last added successfully");
	}
	
	
	//method for inserting in a doubly linked list at a given position
	public static void inserpos(Dll doublyll,int pos,int data) {
		int a=len(doublyll);
		if(pos<1){
			System.out.println("invalid position");
			return;
		}
		Node last=doublyll.head;
		int counter=1;
		 if(pos==1) {
			inserfir(doublyll,data);
			return;
		}
		 if(pos>a) {
			 System.out.println("invalid positon, positions should be less than "+a);
			 return;
		 }
		 
		else {
			Node new_node=new Node(data);
		while(counter<pos-1) {
			last=last.forw;
			counter++;
		}
		new_node.prev=last;
		new_node.forw=last.forw;
		last.forw=new_node;
		new_node.forw.prev=new_node;
		System.out.println("new node is added at "+pos+" position");
	}}
	
	//method for determining the length doubly linked list length
	public static int len(Dll doublyll) {
		int counter=0;
		Node last=doublyll.head;
		while(last!=null) {
			last=last.forw;
			counter++;
		}
		return counter;
	}

	
	//method for printing the doubly linked list
	public static void printddl(Dll doublyll) {
		Node last=doublyll.head;
		System.out.print("Doubly linkedlist is : ");
		while(last!=null) {
			System.out.print(last.data+" ");
			last=last.forw;
		}
		System.out.println();
	}
	
	//method for deleting first node
	public static void delfir(Dll doublyll) {
		if(doublyll.head==null) {
			System.out.println("the list is already empty");
		}
		else {
		doublyll.head=doublyll.head.forw;
		doublyll.head.prev=null;
		System.out.println("node deleted successfully");
		return;
		}
	}
	
	
	//method for deleting the last node
	public static void dellas(Dll doublyll) {
		Node last=doublyll.head,temp=null;
		if(last==null) {
			System.out.println("the node is already empty");
		}
		else {
			temp=doublyll.tail;
			temp.prev.forw=null;
			doublyll.tail=doublyll.tail.prev;
			}
			
			System.out.println("last node is deleted successfully");
		}
	
	//method for deleting the specific position node
	public static void delpos(Dll doublyll,int pos) {
		int a=len(doublyll), counter=1;
		Node temp=doublyll.head;
		if(pos>a) {
			System.out.println("invalid position(you gave position greater than length of the list");
		    return;
		}
		else if(pos==1) {
			delfir(doublyll);
			return;
		}
		else if(pos==a) {
			dellas(doublyll);
			return;
		}
		else {
			while(counter<pos) {
				temp=temp.forw;
				counter++;
			}
			temp.prev.forw=temp.forw;
			temp.forw.prev=temp.prev;
			System.out.println("node at poistion "+pos+" is deleted");
		}
		
	}
	
	
	//method for deletion using data as key
	
	public static void delkey(Dll doublyll,int key) {
		Node now=doublyll.head,before=null;
		if(now!=null&&now.data==key) {
			delfir(doublyll);
		}
		while(now!=null&&now.data!=key) {
			before=now;
			now=now.forw;
		}
		if(now!=null) {
			before.forw=now.forw;
			now.forw.prev=before;
			System.out.println("the key "+key+" found and deleted");
		}
		if(now==null) {
			System.out.println("the key "+key+"is not found");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dll doublylinkli=new Dll();
		doublylinkli=form(doublylinkli,1);
		doublylinkli=form(doublylinkli,2);
		doublylinkli=form(doublylinkli,3);
		doublylinkli=form(doublylinkli,4);
		printddl(doublylinkli);
		inserfir(doublylinkli,0);
		printddl(doublylinkli);
		inserla(doublylinkli,5);
		printddl(doublylinkli);
		inserpos(doublylinkli,3,6);
		printddl(doublylinkli);
		delfir(doublylinkli);
		printddl(doublylinkli);
		inserpos(doublylinkli,8,90);
		dellas(doublylinkli);
		printddl(doublylinkli);
		delpos(doublylinkli,3);
		printddl(doublylinkli);
		delkey(doublylinkli,6);
		printddl(doublylinkli);
	}

}