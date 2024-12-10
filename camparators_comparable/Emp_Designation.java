package camparators_comparable;

import java.util.Comparator;

public class Emp_Designation implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDesignation().compareTo(o2.getDesignation());
	}

}
