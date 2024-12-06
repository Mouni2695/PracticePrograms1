package methods;

public class Hostel {
	int rooms;
	//with return type and with parameters
	public int count_Rooms(int rooms) {
		System.out.println(" Total No of Rooms : "+rooms);
		return rooms;
	}
   public static void main(String[] args) {
	Hostel h=new Hostel();
	h.count_Rooms(10);
}
}
