package queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class CreateQueue {
	public static void main(String[] args) {
		//max priority
		Queue<Integer>q=new PriorityQueue<Integer>(Collections.reverseOrder());
		//q.add(10);
		q.offer(80);
		q.offer(50);
		q.offer(20);
		q.offer(30);
		q.offer(10);
		
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println("Max priority :");
		while(!q.isEmpty())
			System.out.println(q.poll());
		
		System.out.println("------------");
		//q.remove();
		q.offer(90);
		q.offer(15);
		System.out.println(q);
		System.out.println("Iterating queue :");
		q.forEach(value->System.out.println(value));
	}

}
