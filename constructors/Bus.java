package constructors;

public class Bus {
	String bus_CompanyName;
	String busType;
	int noOfSeats;
	//parameterized constructor 
	public Bus(String bus_CompanyName, String busType, int noOfSeats) {
		super();
		this.bus_CompanyName = bus_CompanyName;
		this.busType = busType;
		this.noOfSeats = noOfSeats;
		System.out.println(bus_CompanyName+" Bus have "+busType+"& "+noOfSeats+"seats available.");
	}
	
	public Bus() {
		
	}

	public static void main(String[] args) {
		Bus bus=new Bus("Volva","AC+Sleeper",20);
	}


}
