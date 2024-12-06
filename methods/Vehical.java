package methods;

import java.util.Scanner;

public class Vehical {
	static String vehicalName;
	void start() {
		System.out.println("The "+vehicalName+" is started.");
	}
	public static void main(String[] args) {
		Vehical v=new Vehical();
		System.out.println("Enter the vehical type : ");
		Scanner sc=new Scanner(System.in);
		vehicalName=sc.next();
		v.start();
		sc.close();
	}
	
}
