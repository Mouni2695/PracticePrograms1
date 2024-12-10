package hotelTypeComparators;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Hotels h1=new Hotels("MinervaGrand","150 Mem", 70,3,500000,"Tirupati",(short) 5);
		Hotels h2=new Hotels("RainPark","60 Mem",55,2,200000,"Chennai",(short) 4);
		Hotels h3=new Hotels("Taj", "300 Mem", 200, 4,1500000, "Hyderabad",(short) 5);
		
		List<Hotels> li= new ArrayList<Hotels>();
		li.add(h3);
		li.add(h1);
		li.add(h2);
		Collections.sort(li,new Ratings());
		Iterator<Hotels> itr=li.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
