package intermediate_terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStream {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(50,40,10,60,20,80,10);
		
		System.out.println(s);
		
		System.out.println("Max Num : "+s.stream().max((m,m1)->m.compareTo(m1)).get());
		System.out.println("Min Num : "+s.stream().min((m,m1)->m.compareTo(m1)).get());
		
		//System.out.println(s.stream().sorted((v1,v2)->v2.compareTo(v1)).findFirst().get());
		System.out.println(s.stream().sorted().findFirst().get());
		System.out.println(s.stream().sorted().limit(3).toList());
		System.out.println(s.stream().sorted().skip(1).findFirst().get());
		System.out.println(s.stream().sorted().collect(Collectors.toSet()));
		
	}
}
