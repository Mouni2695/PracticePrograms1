package java8_Features;

public class Bike implements Default_StaticMethods {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a Pulser Bike & Its a black Color");
	}
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.display();
	    Default_StaticMethods.start();
	}

}
