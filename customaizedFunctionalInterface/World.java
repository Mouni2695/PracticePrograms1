package customaizedFunctionalInterface;

public class World {
	public static void main(String[] args) {
		Population<Integer, Integer> pop=i->{
			System.out.println("Population is : "+i+" billions");
			return i;
		};
		pop.count(8);
		//BiPopulation
		BiPopulation<Integer, Float, Float>bp=(i,f)->{
			//System.out.println(i+f);
			return f;
		};
		Float f1=bp.count(1500,1500.5f);
		System.out.println(f1);
		//
		SocialMedia<String>sm=(m)->{
			System.out.println("App is : "+m);
			return true;
		};
		sm.Apps("WhatsApp");
		//
		Nature<Integer>nature=n->System.out.println("Animals :"+n);
        nature.animals(12000);

	}

}
