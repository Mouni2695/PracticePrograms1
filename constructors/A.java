package constructors;

public class A {
	A(){
		System.out.println("Without parameters.");
	}
	//constructor override
	A(int a){
		System.out.println(a);
	}
   public static void main(String[] args) {
	A a=new A(10);
	System.out.println(a.getClass());
	A a1=new A();
	System.out.println(a1.getClass());
}
}

