package linkedlist;

public class Implemen {
	 Node head;
	//class for node declaration
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	//method for forming a linked list
	public static Implemen llinsert(Implemen Linkedlist,int data) {
		Node new_node=new Node(data);
		if(Linkedlist.head==null) {
			Linkedlist.head=new_node;
		}
		else {
			Node last=Linkedlist.head;
			while(last.next!= null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return Linkedlist;
	}
	
	
	//method for printing linked list
	
	public static void printll(Implemen Linkedlist) {
		Node currnode=Linkedlist.head;
		
		System.out.print("linked list is ");
		while(currnode!=null) {
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
		System.out.println();
	}
	
	//method for deleting using data as reference
	
	@SuppressWarnings("unused")
	public static Implemen deldat(Implemen Linkedlist,int key) {
		Node now_node=Linkedlist.head,prev=null;
		if(now_node!=null&&now_node.data==key) {
			Linkedlist.head=now_node.next;
			System.out.println(key+" found and deleted");
			return Linkedlist;
		}
		while(now_node!=null&&now_node.data!=key) {
			prev=now_node;
			now_node=now_node.next;
		}
		if(now_node.next!=null) {
			prev.next=now_node.next;
			System.out.println(key+ " found and deleted");
		}
		if(now_node==null) {
			System.out.println(key+" not found");
		}
		
		return Linkedlist;
	}
	
	
	//method for deleting using position as reference
	
	public static Implemen delref(Implemen Linkedlist,int pos) {
		Node currnode=Linkedlist.head,prev=null;
		
		if(pos==0&&currnode!=null) {
			Linkedlist.head=currnode.next;
			System.out.println("at index "+pos+" the value is found and deleted");
			return Linkedlist;
		}
		int counter=0;
		while(currnode!=null) {
			if(counter==pos) {
				prev.next=currnode.next;
				System.out.println("at index "+pos+" the value is found and deleted");
				break;
			}
			else {
			prev=currnode;
			currnode=currnode.next;
			counter++;
			}
		}
		if(currnode==null) {
			System.out.println("position not found or invalid position");
		}
		return Linkedlist;
		
	}
	
	//method for insertion of linked list at a given position
	public static void inserafir(Node prev,int data) {
		if(prev==null) {
			System.out.println("it is insertion at last,call another method");
			return;
		}
		Node new_node=new Node(data);
		new_node.next=prev.next;
		prev.next=new_node;
		System.out.println("new node is added successfully");
	}
	
	
	//method for insertion of linked list at last position
	public static void inserla(int data,Implemen Linkedlist) {
		Node new_node=new Node(data);
		//if list is empty
				if(Linkedlist.head==null) {
					Linkedlist.head=new Node(data);
					return;
				}
			new_node.next=null;
			Node last=Linkedlist.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
			System.out.println("new node at last is appended successfully");
		return;
	}
	
	//method for insertion at first position
	public static void first(Implemen Linkedlist,int data) {
		Node new_node=new Node(data);
		new_node.next=Linkedlist.head;
		Linkedlist.head=new_node;
		System.out.println("new node at first is added successfully");
	}
	
	//**************************  MAIN METHOD  **************************************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implemen Linkedlist=new Implemen();
		Linkedlist=llinsert(Linkedlist,4);
		Linkedlist=llinsert(Linkedlist,5);
		Linkedlist=llinsert(Linkedlist,6);
		Linkedlist=llinsert(Linkedlist,7);
		Linkedlist=llinsert(Linkedlist,8);
		printll(Linkedlist);
		Linkedlist=deldat(Linkedlist,7);
		printll(Linkedlist);
		Linkedlist=(delref(Linkedlist,3));
		printll(Linkedlist);
		inserafir(Linkedlist.head.next,10);
		printll(Linkedlist);
		inserla(4,Linkedlist);
		printll(Linkedlist);
		first(Linkedlist,78);
		printll(Linkedlist);
	}

}
