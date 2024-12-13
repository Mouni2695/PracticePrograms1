package anonymousClasses;

import java.util.Arrays;
import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		List<Student>list=Arrays.asList(new Student(05,"Mounika"),new Student(10,"Teja"),new Student(01,"Sri"));
        System.out.println(list);
        
        Comparator<Student> idcom=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
		};
        Comparator<Student> namecom=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		Collections.sort(list,idcom);
		System.out.println(list);
		Collections.sort(list,namecom);
		System.out.println(list);
	}

}
