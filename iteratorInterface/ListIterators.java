package iteratorInterface;

import java.util.*;

public class ListIterators {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(40);
		l1.add(60);
		l1.add(40);
		l1.add(70);
		
		Iterator<Integer>itr=l1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println("---------");
		//String
		List<String> l2=new ArrayList<String>();
		l2.add("Mouni");
		l2.add("Mahi");
		l2.add("Sri");
		l2.add("Sasi");
		l2.add("Rani");
		
		Iterator<String>it=l2.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("-------");
		//float
		List<Float>l3=new ArrayList<Float>();
		l3.add(1.0f);
		l3.add(4.8f);
		l3.add(5.9f);
		l3.add(2.5f);
		l3.add(3.6f);
		Iterator<Float>itf=l3.iterator();
		while(itf.hasNext())
			System.out.println(itf.next());
		System.out.println("-------");
		//linkedList
		List<Integer>l4=new LinkedList<Integer>();
		l4.add(100);
		l4.add(300);
		l4.add(900);
		l4.add(400);
		l4.add(700);
	    ListIterator<Integer>li=l4.listIterator();
	    while(li.hasNext())
	    	System.out.println(li.next());

		
		
		

	}

}
