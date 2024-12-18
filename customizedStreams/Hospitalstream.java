package customizedStreams;

import java.util.Arrays;
import java.util.List;

public class Hospitalstream {

	public static void main(String[] args) {
		List<Hospitals>list=Arrays.asList(new Hospitals("Amar","Kukatpally", "Cordiologist"),new Hospitals("Yashoda","Hotechcity", "Gynacologist"),
				new Hospitals("ESI","Erragadda", "Pshycologist"),new Hospitals("Care","BanjaraHills", "Nephralagist"),
				new Hospitals("Remidy","KPHB", "Dermatalogist"),
				new Hospitals("Apolo","JubliHills", "Cardiologist"));
		
		System.out.println(searchByLocation(list));
		System.out.println(searchByName(list));
		System.out.println(searchBySpecailist(list));

	}
	public static List<Hospitals> searchByLocation(List<Hospitals> a){
		return a.stream().filter(l->l.getLocation().equals("KPHB")).toList();
	}
	public static List<Hospitals> searchByName(List<Hospitals> a){
		return a.stream().filter(l->l.getName().equals("Care")).toList();
	}
	public static List<Hospitals> searchBySpecailist(List<Hospitals> a){
		return a.stream().filter(l->l.getSpecialization().startsWith("C")).toList();
	}

}
