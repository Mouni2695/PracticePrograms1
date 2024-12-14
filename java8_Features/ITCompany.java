package java8_Features;
@FunctionalInterface
public interface ITCompany {
	void companyDetails();
	static void advantages(){
		System.out.println("This Company Provides PF & ESI for Every Employee.");
	}
	default void leave() {
		System.out.println("The HP company provides 2 weeks of extra leaves in a year.");
	}

}
