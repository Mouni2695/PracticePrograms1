package customizedStreams;

import java.util.Arrays;
import java.util.List;

public class MapInterfaces {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(90,20,40,10,70,30);
		
		System.out.println(list.stream().map(m->m+5).toList());
		System.out.println(list.stream().map(m->m+5).filter(m->m>50).toList());
		
		System.out.println(list.stream().map(m1->m1/5).filter(m1->m1<10).
				map(m1->m1+2).toList());
		System.out.println(list.stream().map(m2->m2*2).toList());
		
	}

}
