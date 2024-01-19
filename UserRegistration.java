package week8;
import java.util.Scanner;
public class UserRegistration {
	public static void registerUser(String userName, String userCountry) throws InvalidCountryException {
		if (!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User outside India cannot be registered");
		} else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,country;
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter user country: ");
		country=sc.nextLine();
		try {
			registerUser(name, country);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
