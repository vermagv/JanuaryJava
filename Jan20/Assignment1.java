import java.util.Scanner;

// Implement ZOMHELLO AND JUMBO using Ternary Operator
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Amount ");
		//double amount=scanner.nextDouble();
		System.out.println("Enter JUMBO or ZOMHELLO ");
		scanner.close();
		int promocode=scanner.nextInt();
		
		int JUMBO=101;
		//int ZOMHELLO=201;
		
		String c1=(promocode==JUMBO) ? "50% cart value off":"60% value off";
		//String c2=(promocode==ZOMHELLO) ? "60% off upto 120":"promocode invalid";
		System.out.println(c1);
		//System.out.println(c2);
											}

}
