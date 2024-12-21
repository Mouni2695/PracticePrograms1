package homeWork;

import java.util.*;

public class SetOfStrings {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("Mounika","Kusuma","Anjali","Dhana");
		List<String> l1=Arrays.asList("Wipro","TCS","IBM","HP");
		List<String> l2=Arrays.asList("Java","Python","C++",".Net");
		
		Set<List<String>> set=new HashSet<List<String>>();
		set.add(l);
		set.add(l1);
		set.add(l);
		set.add(l2);
		
		Set<List<String>> set1=new HashSet<List<String>>();
        set1.add(l2);
        
		Iterator<List<String>> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//map
		
		Map<String, Set<List<String>>> simpleSet = new HashMap<String, Set<List<String>>>();
		simpleSet.put("1st", set);
		simpleSet.put("2nd", set1);

		System.out.println(simpleSet);


	}

}
