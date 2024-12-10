package camparators_comparable;

import java.util.*;

public class Lists {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmp_ID(101);
		e.setEmp_Name("Mounika");
		e.setEmp_Address("Andra");
		e.setDesignation("Software Engineer");
		e.setSalary(30000.00f);
		//System.out.println(e);
		
		Employee e1=new Employee();
		e1.setEmp_ID(102);
		e1.setEmp_Name("Mahi");
		e1.setEmp_Address("Hyderabad");
		e1.setDesignation("AssociateSoftware Engineer");
		e1.setSalary(25000.00f);
		//System.out.println(e1);
		
		List<Employee>l=new ArrayList<Employee>();
		l.add(e);
		l.add(e1);
		//l.add(e2);
		Collections.sort(l,new Emp_Name());
		System.out.println(l);
	}

}
