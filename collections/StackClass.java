package collections;

import java.util.Enumeration;
import java.util.*;

public class StackClass {

	public static void main(String[] args) {
		 Stack<Integer>s=new Stack<Integer>();
		 s.add(100);
		 s.add(200);
		 s.add(300);
		 s.add(400);
		 s.add(500);
		 System.out.println(s);
		 Enumeration<Integer>e=s.elements();
	     while(e.hasMoreElements())
	    	 System.out.println(e.nextElement());
	}

}
