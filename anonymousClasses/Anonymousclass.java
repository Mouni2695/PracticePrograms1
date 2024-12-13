package anonymousClasses;

//import java.util.Arrays;
import java.util.*;

public class Anonymousclass {
	public static void main(String[] args) {
		List<Employee>list=new ArrayList<Employee>();
		System.out.println(list);
		Employee emp=new Employee() {

			@Override
			void customer_Details() {
				// TODO Auto-generated method stub
				System.out.println("Display the Employee Details.");
			}
			
		};
		emp.customer_Details();
	}

}
