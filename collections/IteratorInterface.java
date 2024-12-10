package collections;

import java.util.*;

public class IteratorInterface {

	public static void main(String[] args) {
	 List<Integer> list=new ArrayList<Integer>();
	 list.add(100);
	 list.add(200);
	 list.add(300);
	 list.add(400);
	 list.add(500);
	 System.out.println("size is : "+list.size());
	 Iterator<Integer> itr=list.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }	 
	 System.out.println("----------");
     Vector<Integer> vec=new Vector<Integer>(5);
     vec.add(600);
	 vec.add(700);
	 vec.add(800);
	 vec.add(900);
	 vec.add(10300);
	 Iterator<Integer> it=vec.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	}
}
