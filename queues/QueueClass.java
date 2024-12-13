package queues;

import java.util.*;

public class QueueClass {

	public static void main(String[] args) {
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.offer(40);
		q.offer(20);
		q.offer(50);
		q.offer(10);
		
		System.out.println(q);
		q.offer(05);
		q.offer(60);
		System.out.println(q);
		q.remove();
		System.out.println(q);

	}

}
