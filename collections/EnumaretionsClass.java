package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class EnumaretionsClass {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		 list.add(100);
		 list.add(200);
		 list.add(300);
		 list.add(400);
		 list.add(500);
		 //System.out.println("size is : "+list.size());
		 //Enumeration<Integer>enu=list.element();
		 System.out.println("List : "+list); 
		 System.out.println("----------");
	     Vector<Integer> vec=new Vector<Integer>(5);
	     vec.add(600);
		 vec.add(700);
		 vec.add(800);
		 vec.add(900);
		 vec.add(1000);
		 System.out.println(vec);
		 Enumeration<Integer>enu=vec.elements();
		 while(enu.hasMoreElements())
			 System.out.println(enu.nextElement());
		// System.out.println("---------");
		
	}

}
