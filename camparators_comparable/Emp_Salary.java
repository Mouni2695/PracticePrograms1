package camparators_comparable;

import java.util.Comparator;

public class Emp_Salary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
