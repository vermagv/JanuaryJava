import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount ");
		double amount=scanner.nextDouble();
		System.out.println("Enter Promo Code ");
		int promoCode=scanner.nextInt();
		scanner.close();
		double discount;
		
		switch(promoCode)
		{
		case 101:  // Case does not support variable name or FINAL int JUMBO= 101
			if(amount>=200)
			{
				discount = amount * 0.5;
				System.out.println("Promocode JUMBO applied successfully, Please pay "+(amount-discount));
			}
			else
			{
				System.out.println("Insufficient cart value, Please add "+(200-amount));
			}
		break;
		case 201:
		
			if(amount>=159)
			{
				discount = amount * 0.6;
				if(discount>=120)
				{
					discount = 120;
				}
				System.out.println("Promocode ZOMHELLO applied successfully, Please pay "+(amount-discount));
				}
			else {
			System.out.println("No promocodes are available. Atleast add "+(159-amount)); 
				 }
		
		break;
		default:
			System.out.println("Promo code invalid, Please try ZOMHELLO or JUMBO");
		}
	}

}
