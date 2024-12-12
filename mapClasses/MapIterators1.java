package mapClasses;

import java.util.*;

public class MapIterators1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new MapInternals<Integer, String>();
		map.put(01,"HYD");
		map.put(05,"BNGL");
		map.put(02,"Chennai");
		map.put(04,"Mumbai");
		map.put(03,"Kalakata");

		Iterator<Integer> it1 = map.keySet().iterator();
		while (it1.hasNext()) {
			int key = it1.next();
			System.out.println(key);
		}
		System.out.println("------------");
		Iterator<Map.Entry<Integer, String>> it2 = map.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> entry = it2.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
