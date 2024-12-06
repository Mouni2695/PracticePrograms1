package methods;

public class RegistraterApplication {
	private static String userName;
	private static int userID;
	//without return type and without parameters
	private static void registerUser() {
		System.out.println("User ID is : "+userID);
		System.out.println("User Name : "+userName);
		
	}
	public static void main(String[] args) {
		RegistraterApplication.userID=10;
		RegistraterApplication.userName="Mounika";
		RegistraterApplication.registerUser();
	}

}
