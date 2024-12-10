package customerTypeComparators;

import java.util.Comparator;

public class CustName implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getCustName().compareTo(c2.getCustName());
	}

}
