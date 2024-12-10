package collections;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Mounika");
		li.add("Hema");
		li.add("pavan");
		System.out.println(li);

		li.add(02, "Teja");
		li.add("chari");
		li.add("jagadeesh");
		System.out.println(li);
		li.remove("pavan");
		System.out.println(li);
		li.addFirst("Java");
		System.out.println(li);
		System.out.println(li.contains("Teja"));
		System.out.println(li.get(3));
		System.out.println(li.getFirst());
		// update
		li.set(4, "Mahi");
		System.out.println(li);
		System.out.println(li.indexOf("Mahi"));
		System.out.println(li.isEmpty());
		System.out.println(li.reversed());

	}

}
