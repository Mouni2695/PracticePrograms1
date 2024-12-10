package collections;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>(5);
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(50);
		
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec.isEmpty());
		vec.add(70);
		vec.add(90);
		vec.add(100);
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		

	}

	
}
