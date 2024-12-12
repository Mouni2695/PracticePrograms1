package mapClasses;

import java.util.*;

public class MapInternals {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Hyd", "Telangana");
		map.put("Bnglr", "Karnataka");
		map.put("Mumbai","Maharastra");
		map.put("Chennai","TamilaNadu");
		map.put("Kalkata","Bangladesh");
		
		System.out.println(map);
		System.out.println("-----------------");
		long hashcode1 = "Hyd".hashCode();
		long hash1 = hashcode1 & 15;
		System.out.println("hashCode :"+hashcode1+"\n"+"hash value :"+hash1);
		
		long hashcode2 = "Bnglr".hashCode();
		long hash2 = hashcode2 & 15;
		System.out.println("hashCode :"+hashcode2+"\n"+"hash value :"+hash2);
		
		long hashcode3 = "Mumbai".hashCode();
		long hash3 = hashcode3 & 15;
		System.out.println("hashCode :"+hashcode3+"\n"+"hash value :"+hash3);
		
		long hashcode4 = "Chennai".hashCode();
		long hash4 = hashcode4 & 15;
		System.out.println("hashCode :"+hashcode4+"\n"+"hash value :"+hash4);
		
		long hashcode5= "Kalkata".hashCode();
		long hash5 = hashcode5 & 15;
		System.out.println("hashCode :"+hashcode5+"\n"+"hash value :"+hash5);
		
		long hashcode6= "Hyd".hashCode();
		long hash6 = hashcode6 & 15;
		System.out.println("hashCode :"+hashcode6+"\n"+"hash value :"+hash6);
    
	}

}
