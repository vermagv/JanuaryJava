import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount ");
		double amount=scanner.nextDouble();
		System.out.println("Enter Promo Code ");
		int promoCode=scanner.nextInt();
		scanner.close();
		System.out.println("The amount is "+amount);
		System.out.println("The Code is "+promoCode);
		
		
		}
	}
