package intermediate_terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentStream {

	public static void main(String[] args) {
		List<Students>list=Arrays.asList(new Students("Mounika","BSc",80),new Students("Gomathy","BSc",90),
				new Students("Veena","MCA",85),new Students("Saleema","MSC",75),
				new Students("Aswini","BZC",60),new Students("Saritha","MSC",70),new Students("Veena","MCA",85));
		
		System.out.println("Max Marks : "+list.stream().max((m,m1)->m.getMarks().compareTo(m1.getMarks())).get());
		System.out.println("Min Marks : "+list.stream().min((m,m1)->m.getMarks().compareTo(m1.getMarks())).get());

		System.out.println(list.stream().sorted((c1,c2)->c2.getMarks().compareTo(c1.getMarks())).findFirst().get());
		System.out.println(list.stream().sorted((s1,s2)->s2.getMarks().compareTo(s1.getMarks())).skip(1).findFirst().get());
		System.out.println(list.stream().sorted((s1,s2)->s2.getMarks().compareTo(s1.getMarks())).limit(3).toList());
		System.out.println(list.stream().sorted((s1,s2)->s2.getMarks().compareTo(s1.getMarks())).findAny().get());
		Set<Students> set=list.stream().collect(Collectors.toSet());
		System.out.println(set);

	}

}
