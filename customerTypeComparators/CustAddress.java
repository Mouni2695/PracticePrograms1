package customerTypeComparators;

import java.util.Comparator;

public class CustAddress implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getCustAddrese().compareTo(c2.getCustAddrese());
	}

}
