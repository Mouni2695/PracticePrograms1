package homeWork;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfStrings {

	public static void main(String[] args) {
		List<String> ls=Arrays.asList("Mounika","Kusuma","Anjali","Dhana");
		List<String> ls1=Arrays.asList("Wipro","TCS","IBM","HP");
		List<String> ls2=Arrays.asList("Java","Python","C++",".Net");


		List<List<String>> list=Arrays.asList(ls,ls1,ls2);
		//Iterating the values
		Iterator<List<String>> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
