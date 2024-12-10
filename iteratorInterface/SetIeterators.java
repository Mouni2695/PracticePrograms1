package iteratorInterface;

import java.util.*;

public class SetIeterators {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		s.add(100);
		s.add(200);
		s.add(500);
		s.add(500);
		s.add(600);
		s.add(800);
		System.out.println("Set");
		Iterator<Integer>i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		//System.out.println(s);
		System.out.println("------");
		System.out.println("LinkedHashSet");
		Set<Integer>s2=new LinkedHashSet<Integer>();
		s2.add(100);
		s2.add(600);
		s2.add(800);
		s2.add(200);
		s2.add(500);
		s2.add(500);
		Iterator<Integer>i2=s2.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		System.out.println("------");
		System.out.println("treeSet");
		Set<Integer>s1=new TreeSet<Integer>();
		s1.add(100);
		s1.add(800);
		s1.add(200);
		s1.add(500);
		s1.add(500);
		s1.add(600);
		//System.out.println(s1);
		Iterator<Integer>i1=s1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());

	}

}
