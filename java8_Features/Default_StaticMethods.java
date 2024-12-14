package java8_Features;
@FunctionalInterface
public interface Default_StaticMethods {
	void display();
	//static()
	static void start() {
		System.out.println("The Vehical is Started");
	}
	default void carColor() {
		System.out.println("The Car is in Red Color.");
	};
}
