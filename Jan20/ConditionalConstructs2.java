import java.util.Scanner;

public class ConditionalConstructs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount ");
		double amount=scanner.nextDouble();
		System.out.println("Enter Promo Code ");
		int promoCode=scanner.nextInt();
		scanner.close();
		int JUMBO=101; // flat 50%  off over rs 200
		int ZOMHELLO=201; // 60% off over 159 upto 120 rs only
		double discount;
		
		
		if(promoCode==JUMBO)
		{
			if(amount>=200)
			{
				discount = amount * 0.5;
				System.out.println("Promocode JUMBO applied successfully, Please pay "+(amount-discount));
			}
			else
			{
				System.out.println("Insufficient cart value, Please add "+(200-amount));
			}
			
		}
		else if(promoCode==ZOMHELLO)
		{
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
		}
		else
		{
			System.out.println("Promo code invalid, Please try ZOMHELLO or JUMBO");
		}
		
	}
}