package mapClasses;

import java.util.*;

public class HashMapIterators {

	public static void main(String[] args) {
		Map<Integer,String>m1=new HashMap<Integer,String>();
		m1.put(105,"Mounika");
		m1.put(103,"Hema");
		m1.put(104,"Teja");
		m1.put(101,"Sree");
		
		Iterator<Integer>itr=m1.keySet().iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			System.out.println(key);//+" "+m1.get(key));
		}
		System.out.println("-------------");	
		Iterator<Map.Entry<Integer,String>>it=m1.entrySet().iterator();	
		while(it.hasNext()){
			Map.Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
