package queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class IteratingQueue {
     //iterating elements
	public static void main(String[] args) {
		Queue<String> q1=new PriorityQueue<String>();
		q1.offer("Java");
		q1.offer("Python");
		q1.offer(".net");
		
		q1.forEach(value->System.out.println(value));
		
		q1.offer("Sap");
		System.out.println(q1);
		
		q1.remove();
		System.out.println(q1);
		System.out.println("------------------------");
		while(!q1.isEmpty())
			System.out.println(q1.poll());
		q1.offer("PHP");
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);

	}

}
