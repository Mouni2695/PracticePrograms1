package customerTypeComparators;

import java.util.Comparator;

public class CustBill implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getBill().compareTo(c2.getBill());
	}

}
