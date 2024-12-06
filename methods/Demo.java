package methods;

public class Demo {
	static String city;
	
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Demo.city = city;
	}
	//without return type and without parameters
	public static void display() {
		System.out.println("Welcome to "+city);
	}
	public static void main(String[] args) {
		Demo.setCity("Hyderabad");
		Demo.display();
	}

}
