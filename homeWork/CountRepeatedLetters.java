package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatedLetters {

	public static void main(String[] args) {
		String  s = "Hello All , You are in Java class";
		
		List<String> list=new ArrayList<String>();
		list.add(s);
		
		//System.out.println(list);
		
		Map<Character,Long> map=list.stream().filter(c->(char)c!='').collect(Collectors.groupingBy(m->m.i,Collectors.counting()));
	System.out.println(map);
	}

}
