package java8_Features;

public class HpCompany implements ITCompany {

	@Override
	public void companyDetails() {
		// TODO Auto-generated method stub
		System.out.println("Company Details : ");
		System.out.println("The Company Name is HP .It is located in Hyderabad.");
	}
	public static void main(String[] args) {
		HpCompany hp=new HpCompany();
		hp.companyDetails();
		ITCompany.advantages();
		hp.leave();
	}

}
