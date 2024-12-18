package customizedStreams;

import java.util.Arrays;
import java.util.List;

public class Flightsteam {

	public static void main(String[] args) {
		List<Flights> lf=Arrays.asList(new Flights("AirIndia",25684, "Hyderabad", "UA", (short) 1, 15000.0f),
				new Flights("Indigo",36584, "Banglore", "Canada", (short) 5, 13000.0f),
				new Flights("Lufthana",86542, "Hyderabad", "Germany", (short) 10, 16000.0f),
				new Flights("British Airways",96584, "Chennai", "UK", (short) 12, 12000.0f),
				new Flights("Qatar Airways",65843, "Chennai", "Dubay", (short) 03, 10000.0f));
		
	System.out.println(searchByLocation(lf));
	System.out.println(searchByDestination(lf));
	System.out.println(searchByName(lf));
	System.out.println(searchByPrices(lf));

	}

	private static List<Flights> searchByLocation(List<Flights> f) {
		
		return f.stream().filter(l->l.getBoardingpoint().equals("Hyderabad")).toList();
	}
   private static List<Flights> searchByDestination(List<Flights> f) {
		
		return f.stream().filter(l->l.getDestination().startsWith("U")).toList();
	}
   private static List<Flights> searchByName(List<Flights> f) {
		
		return f.stream().filter(l->l.getName().contains("I")).toList();
	}
   private static List<Flights> searchByPrices(List<Flights> f) {
		
		return f.stream().filter(l->l.getPrices()>=15000).toList();
	}
   
}
