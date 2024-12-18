package customizedStreams;

import java.util.Arrays;
import java.util.List;

public class HotelStream {

	public static void main(String[] args) {
		List<Hotels>lh=Arrays.asList(new Hotels("Taj Krishna","Hyderabad", "7*",7000.00),new Hotels("Novotel","Hyderabad", "7*",8000.00),
				new Hotels("The Park","Hyderabad", "5*",6000.00),new Hotels("ParkHayatt","Hyderabad", "7*",14500.00),
				new Hotels("HolidayINN","Hyderabad", "3*",4000.00),new Hotels("ITC","Hyderabad", "5*",6500.00));
		
		/*List<Hotels> listhotels=lh.stream().filter(h->h.getHotelName().equals("Taj Krishna")).toList();
		List<Hotels> listhotels1=lh.stream().filter(s->s.getStarcategiry().equals("7*")).toList();
		List<Hotels> listhotels2=lh.stream().filter(p->p.getPrices()>6000.00).toList();
		
		System.out.println(listhotels);
		System.out.println(listhotels1);
		System.out.println(listhotels2);*/
		
		//lh.stream().forEach(x->System.out.println(x));
		
		System.out.println(searchByCatagiry(lh));
		System.out.println(searchByPrices(lh));
		System.out.println(searchByLocation(lh));

	}
	public static List<Hotels> searchByLocation(List<Hotels> hotel) {
		 return hotel.stream().filter(h->h.getLocation().equals("Hyderabad")).toList();
	}
	public static List<Hotels> searchByPrices(List<Hotels> hotel) {
		 return hotel.stream().filter(p->p.getPrices()>6500).toList();
	}
	public static List<Hotels> searchByCatagiry(List<Hotels> hotel) {
		 return hotel.stream().filter(s->s.getStarcategiry().equals("5*")).toList();
	}
	

}
