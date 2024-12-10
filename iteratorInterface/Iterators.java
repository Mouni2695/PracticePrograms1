package iteratorInterface;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(40);
		l1.add(70);
		l1.add(90);
		l1.add(60);
		l1.add(40);
		l1.add(20);
		
		System.out.println("List : "+l1);
		Set<Integer>s1=new HashSet<Integer>(l1);
		System.out.println("Set : "+s1);
		
		Set<Integer>s2=new LinkedHashSet<Integer>(l1);
		System.out.println("LinkedHashSet : "+s2);
		
		Set<Integer>s3=new TreeSet<Integer>(l1);
		System.out.println("TreeSet : "+s3);
		
		Set<Integer>s4=new TreeSet<Integer>(Collections.reverseOrder());
		s4.add(10);
		s4.add(40);
		s4.add(70);
		s4.add(90);
		s4.add(60);
		s4.add(40);
		s4.add(20);
		System.out.println("SortedSet : "+s4);

	}

}
