package java8_Features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctions {

	public static void main(String[] args) {
		//Function
		System.out.println("Function : ");
		Function<Integer, Integer> fun = (i) -> {
			System.out.println("i :" + i);
			return i;
		};
		fun.apply(10);
		
		// BiFunction
		System.out.println("BiFunction :");
		BiFunction<Integer, String, String> bf = (i, s) -> {
			return s+" "+i;
		};
		String retvalue=bf.apply(8,"Java");
		System.out.println(retvalue);
		System.out.println("---------------");
		BiFunction<Integer, Float, Float> bf1 = (a, b) -> {
			float sum=a+b;
			return sum;
		};
		Float value=bf1.apply(100,200.0f);
		System.out.println(value);
		
		//Consumer
		System.out.println("Consumer Interface :");
		Consumer<String>con=(s1)->System.out.println("s1 : "+s1);
		con.accept("Tronix");
		
		//BiConsumer
		System.out.println("BiConsumer");
		BiConsumer<String, Integer>bc=(s2,a)->System.out.println(s2+" "+a);
		bc.accept("A",20);
		System.out.println("---------");
		BiConsumer<Integer, Integer>bc1=(x,y)->System.out.println(x+y);
		bc1.accept(5, 5);
		
		//predicate
		System.out.println("Predicate : ");
		Predicate<String>pr=s ->{
			System.out.println("S : "+s);
			return false;
		};
		pr.test("");
		
		//BiPredicate
		System.out.println("BiPredicate : ");
		BiPredicate<Double,Long>bp=(d,l)->{
			System.out.println("D :"+d+"\n"+"L :"+l);
			return true;
		};
		bp.test(9.8,8143632695l);
		
		//bp.negate();

	}

}
