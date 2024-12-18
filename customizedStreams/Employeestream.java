package customizedStreams;

import java.util.Arrays;
import java.util.List;

public class Employeestream {

	public static void main(String[] args) {
		List<Employee>list=Arrays.asList(new Employee(01, "Sri", "Idea", "QA",3.6f),new Employee(02, "Ramya", "Embeded", "Sr.SE",7.0f),
				new Employee(03, "Siva", "A2Z", "Manager",3.6f),new Employee(04, "Surya", "CreamStone", "Manager",3.5f));
		
		System.out.println(list.stream().filter(e->e.getEmpName().startsWith("S")).toList());
		System.out.println(list.stream().filter(s->s.getSalary()>3.6f).toList());
		System.out.println(list.stream().filter(d->d.getDesignation().equals("Manager")).toList());

	}

}
