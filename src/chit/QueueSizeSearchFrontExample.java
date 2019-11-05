package chit;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeSearchFrontExample {
	public static void main(String [] args)
	{
		Queue<String> waitingQueue=new LinkedList<>();
		waitingQueue.add("Jennifer");
		
		waitingQueue.add("Angelina");
		waitingQueue.add("Jhonny");
		waitingQueue.add("Sachin");
		System.out.println("waitingQueue : " + waitingQueue);
		System.out.println("WaitingQueue empty? : " + waitingQueue.isEmpty());
		System.out.println("Size of waiting queue : " + waitingQueue.size());
		String name = "Johnny";
		if(waitingQueue.contains(name)) {
			System.out.println("waitingQueue contains " + name);
			
		}
		else {
			System.out.println("waitingQueue doesn't contain " + name);
		}
		String firstPersonInTheWaitingQueue = waitingQueue.element();
		System.out.println("First Person in the waiting Queue (element())");
		firstPersonInTheWaitingQueue = waitingQueue.peek();
		System.out.println("First Person in the waiting Queue : " + firstPersonInTheWaitingQueue);
	}

}
