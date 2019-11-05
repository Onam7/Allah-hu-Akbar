package chit;

public class LinkedListDuplicate {
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
	void removeDuplicates()
	{
		/*Another refrence to head*/
		Node curr = head;
		/*Traverse list till the last node*/
		Node temp = curr;
		while(temp!=null&&temp.data==curr.data) {
			temp=temp.next;
			
		}
		/*set current node next to the next different element denoted by temp*/
		curr.next = temp;
		curr = curr.next;
		
	}


{

int new_data;
Node new_node = new Node(new_data);
new_node.next = head;
head =new_node;
}
{
	Node temp = head;
	while(temp!=null);
	{
		System.out.print(temp.data+"");
		temp = temp.next;
	}
	System.out.println();
}
{
	LinkedListDuplicate llist=new
			LinkedListDuplicate();
			llist.push(20);
			llist.push(13);
			llist.push(13);
			llist.push(11);
			llist.push(11);
			llist.push(11);
			System.out.println("List after removal of duplicates");
			llist.
			llist.removeDuplicates();
			System.out.println("List after removal of elements");
			llist.printList();
}
private void push(int i) {
	// TODO Auto-generated method stub
	
}
private void printList() {
	// TODO Auto-generated method stub
	



			
			
	
			
	

