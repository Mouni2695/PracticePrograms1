package homeWork;

import java.util.Arrays;
import java.util.*;
import java.util.Iterator;
import java.util.List;

import customizedStreams.Employee;

public class ListOfEmployee {

	public static void main(String[] args) {
		List<Employee>e1=Arrays.asList(new Employee(01, "Sri", "Idea", "QA",3.6f),new Employee(02, "Ramya", "Embeded", "Sr.SE",7.0f));
		List<Employee>e2=Arrays.asList(new Employee(03, "Siva", "A2Z", "Manager",3.6f),new Employee(04, "Surya", "CreamStone", "Manager",3.5f));

		List<List<Employee>> emp=Arrays.asList(e1);
		List<List<Employee>> emp1=Arrays.asList(e2);

		List<List<List<Employee>>> employee=Arrays.asList(emp,emp1);
		
		//Iterating the values
		Iterator<List<List<Employee>>> itr=employee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------");
		//map
		Map<Integer, List<List<Employee>>> empMap = new HashMap<Integer, List<List<Employee>>>();
		empMap.put(1, emp);
		empMap.put(2, emp1);
		
		System.out.println(empMap);
		/*Iterator<List<List<Employee>>> itr1=employee.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}*/
	}

}
