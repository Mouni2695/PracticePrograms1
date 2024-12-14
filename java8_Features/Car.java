package java8_Features;

public class Car implements Default_StaticMethods{
   
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a Car");
	}
	/*@Override
	public void carColor() {
		// TODO Auto-generated method stub
		Default_StaticMethods.super.carColor();
	}*/
	 public static void main(String[] args) {
			Car car=new Car();
			car.display();
			car.carColor();
			Default_StaticMethods.start();
		}

}
