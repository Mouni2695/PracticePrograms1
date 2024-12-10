package camparators_comparable;

import java.util.Comparator;

public class Emp_Address implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmp_Address().compareTo(o2.getEmp_Address());
	}

	

}
