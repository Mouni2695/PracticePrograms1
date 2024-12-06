package constructors;

public class Bank {
	String bank_Name;
	Bank(){
		System.out.println("Welcom to Our Bank");
	}
	// constructor Overloading
	Bank(String bank_Name){
		System.out.println("The Bank Name is : "+bank_Name);
	}
	public static void main(String[] args) {
		Bank bank=new Bank();
		Bank bank1=new Bank("RBI");
	}

}

	
