package constructors;

public class RBI {
	//constructor chaining
	RBI(){
		System.out.println("RBI Bank");
	}
	public static void main(String[] args) {
       HDFC hdfc=new HDFC();
       System.out.println("These Branches are in "+(hdfc.branch="Hyderabad."));
	}
}
class SBI extends RBI{
	String branch;
	SBI(){
		super();
		System.out.println("This is SBI Bank");
	}
}
class HDFC extends SBI{
	String bankID;
	HDFC(){
		super();
		System.out.println("This is HDFC Bank");
	}
}