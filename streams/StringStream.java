package streams;

import java.util.Arrays;
import java.util.List;

public class StringStream {

	public static void main(String[] args) {
		// String[] str = { "Bangalore", "Hyderabad",
		// "Mumbai","Chennai","Kalkata","Delhi","Agrha","Bhopal","Chandigarh" };

		List<String> l = Arrays.asList("Bangaloe", "Hyderabad", "Mumbai", "Chennai", "Kalkata", "Delhi", "Agrha",
				          "Bhopal", "Chandigarh","GandiNagar");
		System.out.println(l.stream().filter(c -> c.startsWith("B")).toList());
		System.out.println(l.stream().filter(c1 -> (c1.length() > 5 && c1.length() <= 10)).toList());
		System.out.println(l.stream().filter(c2 -> c2.endsWith("e")).toList());

	}

}
