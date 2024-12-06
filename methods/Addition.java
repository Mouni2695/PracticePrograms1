package methods;

public class Addition {
	int a=10;
	int b=20;
	//without parameters
	public int add() {
		int c=a+b;
		return c;
	}
   public static void main(String[] args) {
	Addition a=new Addition();
	System.out.println("A ="+a.a);
	System.out.println("B ="+a.b);
	System.out.println("C ="+a.add());
}
}
