package chit;

public class LinkedListRotate {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
			
		}
	}
	void rotate(int k)
	{
		if(k==0) return;
		Node current = head;
		int count = 1;
		while(count < k && current!=null)
		{
			current = current.next;
			count++;
			
		}
		if(current==null)
			return;
		Node KthNode=current;
		while(current.next!=null)
			current=current.next;
		current.next=head;
		head=KthNode.next;
		KthNode.next=null;
	}
	void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		LinkedListRotate llist=new LinkedListRotate();
		for(int i=30;i>=5;i-=5)
			llist.push(i);
		System.out.println("Given list");
		llist.printList();
		llist.rotate(4);
		System.out.println("Rotated Linked List");
		llist.printList();
	}

		
		
	}
	
	
	

	
