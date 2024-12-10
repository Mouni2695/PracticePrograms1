package hotelTypeComparators;

import java.util.Comparator;

public class HotelName implements Comparator<Hotels>{

	@Override
	public int compare(Hotels h1, Hotels h2) {
		// TODO Auto-generated method stub
		return h1.getHtlName().compareTo(h2.getHtlName());
	}

}
