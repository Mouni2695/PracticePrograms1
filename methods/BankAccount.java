package methods;

public class BankAccount {
	public String acc_holderName;
	private long acc_Num;
	public long getAcc_Num() {
		return acc_Num;
	}
	public void setAcc_Num(long acc_Num) {
		this.acc_Num = acc_Num;
	}
	//with parameters without return type
	protected void acc_Details(String acc_holderName,long acc_Num) {
		System.out.println("Account holder Name : "+acc_holderName);
		System.out.println("Account Num :"+acc_Num);
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.acc_Details("Mahi",635842167);
	}

}
