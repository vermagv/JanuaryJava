
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 3565.55;
		double tax = 0.18;
		double total = amount + (amount*tax);
		System.out.println("\u20b9"+total);
		
		int number = 10;
		int buckets = 3;
		int hashcode = number % buckets;
		System.out.println(hashcode);
		
		int eWallet = 500;
		int myWallet = eWallet;
		eWallet += 100;
		System.out.println(eWallet);
		
		eWallet %= 7;
		System.out.println(eWallet);
		
		int quantity = 1;
		quantity++;
		++quantity;
		++quantity;
		--quantity;
		
		int value = quantity++;
		System.out.println(quantity);
		System.out.println(value);
		
		int CabFare= 300;
		System.out.println("Can i book a cab? "+(eWallet>=CabFare));
		
		int promoCode=101;
		int promoCodebyUser=201;
		System.out.println("Can i get discount? "+(promoCode==promoCodebyUser));		
		System.out.println("Can i book and get discount? "+((eWallet>=CabFare)&&(promoCode==promoCodebyUser)));
		
		boolean isGPSon=true;
		System.out.println(isGPSon);
		System.out.println(!isGPSon);
		
	}
}
