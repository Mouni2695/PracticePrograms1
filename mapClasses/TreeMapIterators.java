package mapClasses;

import java.util.*;

public class TreeMapIterators {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(01,"HYD");
		map.put(05,"BNGL");
		map.put(02,"Chennai");
		map.put(04,"Mumbai");
		map.put(03,"Kalakata");
		//map.put(null, null);
		Iterator<Integer> i=map.keySet().iterator();
		while(i.hasNext()) {
			int key=i.next();
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("------------------------");
		Iterator<Map.Entry<Integer,String>>it=map.entrySet().iterator();	
		while(it.hasNext()){
			Map.Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
