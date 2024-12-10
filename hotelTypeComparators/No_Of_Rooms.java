package hotelTypeComparators;

import java.util.Comparator;

public class No_Of_Rooms implements Comparator<Hotels>{

	@Override
	public int compare(Hotels h1, Hotels h2) {
		// TODO Auto-generated method stub
		return h1.getNo_of_Rooms().compareTo(h2.getNo_of_Rooms());
	}

}
