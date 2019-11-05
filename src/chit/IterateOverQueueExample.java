package chit;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class IterateOverQueueExample {

public static void main(String []  args) {
	Queue<String> waitingQueue = new LinkedList<>();
	waitingQueue.add("John");
	waitingQueue.add("Brad");
	waitingQueue.add("Angenlina");
	waitingQueue.add("Julia");
System.out.println("=== Iterating over a Queue" + " using java 8 for each() ===");
waitingQueue.forEach(name -> {
	System.out.println(name);
});
System.out.println("\n=== Iterating over a Queue" + " using.iterator===");
		Iterator<String> waitingQueueIterator = waitingQueue.iterator();
		while (waitingQueueIterator.hasNext()) {
			String name = waitingQueueIterator.next();
			System.out.println(name);
			
		}
		System.out.println("\n=== Iterator over a Queue using" + "iterator() and java 8 forEachRemanining() ===");
		waitingQueue
}
}
