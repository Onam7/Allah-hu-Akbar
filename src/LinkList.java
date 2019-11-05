
public class LinkList {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
			
		}
	}
	public static void main(String[] args)
	{
		LinkList linkedlist = new LinkList();
		linkedlist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		linkedlist.head.next = second;
		second.next = third;
		System.out.println(linkedlist);
		Node current = linkedlist.head;
		while(current!= null) {
			System.out.print("->"+current.data);
			current=current.next;
		}
	}
}