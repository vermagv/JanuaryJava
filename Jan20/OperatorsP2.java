
public class OperatorsP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 8;
		int num2= 10;
		int result1= num1&num2;
		int result2 = num1^num2;
		int result3 = num1|num2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		int x=8;
		int y=3;
		int z=x>>y;
		System.out.println(z);
		z=x<<y;
		System.out.println(z);
		
		int a=11;
		int b=2;
		int c=a>>b;
		System.out.println(c);
		c=a<<b;
		System.out.println(c);
		int d=-a;
		c=d<<b;
		System.out.println(c);
		c=d>>b;
		System.out.println(c);
		c=a>>>b;
		System.out.println(c);
		
		int eWallet = 100;
		int CabFare = 5000;
		String msg=((eWallet>=CabFare) ? "Cab Booked":"Not Booked");
		System.out.println(msg);
		
	}

}
