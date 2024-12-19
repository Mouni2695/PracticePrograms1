package intermediate_terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamMethoda {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Mounika","Triveni","Rachana","Ramya","Swathi","Madhuri","Triveni");
		
		System.out.println(list);
		System.out.println(list.stream().max((n,n1)->n1.compareTo(n)).get());
		System.out.println(list.stream().min((n,n1)->n1.compareTo(n)).get());

		System.out.println(list.stream().sorted().toList());
		System.out.println(list.stream().sorted().skip(2).findFirst().get());
		System.out.println(list.stream().sorted().limit(3).toList());
		System.out.println(list.stream().collect(Collectors.toSet()));

	}

}
