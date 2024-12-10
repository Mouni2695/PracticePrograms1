package collections;

import java.util.*;
import java.util.ListIterator;

public class ListIterators {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		/*ListIterator<Integer>l1=list.listIterator();
		while(l1.hasNext())
			System.out.println(l1.nextIndex());*/
		//System.out.println("------");
		ListIterator<Integer>l2=list.listIterator();
		while(l2.hasPrevious())
			System.out.println(l2.previous());

	}

}
