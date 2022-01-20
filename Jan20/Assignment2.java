import java.util.Scanner;

//Implement cab book
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to OLA Ludhiana, Enter your location ");
		int location =scanner.nextInt();
		System.out.println("Enter your destination ");
		int destination=scanner.nextInt();
		scanner.close();
		int ludhiana = 101;
		int busStand = 202;
		int rlyStn = 303;
		if(location==ludhiana)
		{
			if(destination==busStand)
			{
				System.out.println("Cab for Ludhiana bus stand available.");
			}
			else if(destination == rlyStn)
			{
				System.out.println("Cab for Ludhiana Railway station available.");
			}
			else
			{
				System.out.println("Sorry, no cabs for the given location available");
			}
			
		}
		else
		{
			System.out.println("Sorry, you are too far");
		}
	}

}
