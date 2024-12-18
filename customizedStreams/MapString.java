package customizedStreams;

import java.util.Arrays;
import java.util.List;

public class MapString {
	public static void main(String[] args) {
		List<String>fruits=Arrays.asList("Mango","Gova","Pineapple","Watermilon","Apple","Promoganate");
        System.out.println(fruits);
		System.out.println(fruits.stream().map(f->f.toUpperCase()).toList());
		System.out.println(fruits.stream().map(f->f.toUpperCase()).filter(f1->f1.startsWith("P"))
				.map(f1->f1+" Cake").toList());

	}

}
