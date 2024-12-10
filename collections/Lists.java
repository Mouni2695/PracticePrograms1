package collections;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(40);

		System.out.println("List size is :" + l1.size());
		System.out.println("l1 :"+l1);

		for (Integer i : l1) {
			
			if (!(l2.contains(i))) {
				l2.add(i);
			}
		}
		System.out.println("l2 :" +l2);
		
	}

}
