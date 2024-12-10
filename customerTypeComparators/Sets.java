package customerTypeComparators;

import java.util.*;

public class Sets {
	public static void main(String[] args) {
		Customer c1=new Customer("Triveni","Kadapa",(long) 930123584,5,1000.00f);
		Customer c2=new Customer("Ramya","Rapur",(long) 635985646,4,2000.00f);
		Customer c3=new Customer("Swathi","Nellore",(long) 770328640,5,600.00f);
		List<Customer>list1=new ArrayList<Customer>();
		list1.add(c3);
		list1.add(c1);
		list1.add(c2);
		list1.add(c1);
		System.out.println("List");
		Collections.sort(list1,new CustBill());
		for(Customer c:list1)
		 System.out.println(c);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("set ");
		Set<Customer>tset=new TreeSet<Customer>(Collections.reverseOrder());
		tset.add(c3);
		tset.add(c1);
		tset.add(c3);
		tset.add(c2);
		tset.add(c1);
		for(Customer cust:tset)
			 System.out.println(cust);
	}

}
