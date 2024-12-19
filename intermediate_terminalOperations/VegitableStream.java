package intermediate_terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VegitableStream {

	public static void main(String[] args) {
		List<Vegitables>l=Arrays.asList(new Vegitables("Carrots", 2f, 50),new Vegitables("Brinjal", 4.5f, 70),
				new Vegitables("Cucumber", 3f, 60),new Vegitables("Tomatos", 5f, 100),
				new Vegitables("Carrots", 2f, 50));

		System.out.println(l);
		System.out.println(heighestPrice(l));
		System.out.println(lowestPrice(l));
		System.out.println(first3Vegitables(l));
		System.out.println( SecondHeighestprice(l));
		System.out.println("--------------------------------------------------");
		System.out.println(maxQuantity(l));
		System.out.println(minQuantity(l));
		System.out.println(l.stream().sorted((c1,c2)->c2.getPrice().compareTo(c1.getPrice())).findFirst().get());
		System.out.println(l.stream().collect(Collectors.toSet()));
		
		
	}
	private static Vegitables heighestPrice(List<Vegitables> list){
		return list.stream().max((m,m1)->m.getPrice().compareTo(m1.getPrice())).get();
	}
	private static Vegitables lowestPrice(List<Vegitables> list){
		return list.stream().min((m,m1)->m.getPrice().compareTo(m1.getPrice())).get();
	}
	private static Vegitables maxQuantity(List<Vegitables> list){
		return list.stream().max((m,m1)->m.getQuantity().compareTo(m1.getQuantity())).get();
	}
	private static Vegitables minQuantity(List<Vegitables> list){
		return list.stream().min((m,m1)->m.getQuantity().compareTo(m1.getQuantity())).get();
	}
	private static Vegitables SecondHeighestprice(List<Vegitables> list) {
		return list.stream().sorted((s1,s2)->s2.getPrice().compareTo(s1.getPrice())).skip(1).findFirst().get();

	}
	private static List<Vegitables> first3Vegitables(List<Vegitables> list) {
		return list.stream().sorted((s1,s2)->s2.getNames().compareTo(s1.getNames())).limit(2).toList();

	}


}
