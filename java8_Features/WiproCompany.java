package java8_Features;

public class WiproCompany implements ITCompany {
	private String location;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public void companyDetails() {
		// TODO Auto-generated method stub
		System.out.println("Company Details : ");
		System.out.println("The Company Name is Wipro .It is located in "+ location);
	}
	public static void main(String[] args) {
		WiproCompany wipro=new WiproCompany();
		wipro.setLocation("Banglore");
		wipro.companyDetails();
		ITCompany.advantages();
	}

}
