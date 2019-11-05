package linklist;
public class Train {
	Coach head;
	static class Coach {
		int capacity;
		String data;
		Coach next;
		Coach(String d, int c)
		{
			capacity = c;
			data = d;
			next = null;
		}
	}

	
		
		
		
	public static void main(String[] args)
	{
		Train linkedlist = new Train();
		
		linkedlist.head = new Coach("A1",50);
		Coach second = new Coach("A2",50);
		Coach third = new Coach("A3",50);
		Coach fourth = new Coach("S1",50);
		linkedlist.head.next = second;
		second.next = third;
		third.next = fourth;
		System.out.print(linkedlist);
		Coach current = linkedlist.head;
		while(current!=null) {
			System.out.print("->"+current.data+current.capacity);
			current = current.next;
		}
	}
}

			

