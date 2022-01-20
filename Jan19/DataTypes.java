
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte age = 35;
		age = 40;
		/* age = 128; error */
		age = (byte)128; // Explicit Downcasting
		short s = 120;
		int eWallet = 300;
		/* long phonenumber = 9090910101; error */
		long phonenumber = 9090910101L ; 
		long data = 200; // upcasting
		int number =(int) data; // explicit Upcasting
		float percentage = 75.7f;
		double discount = 0.65;
		float pi  = (float)3.14; // explicit downcasting
		double pii = pi; // Explicit upcasting
		char ch = 65;
		ch = 'B';
		ch='\u20b9';
		boolean internet = true;
		internet = false;
		System.out.println(age+" "+s+" "+eWallet+" "+phonenumber+" "+percentage+" "+discount+" "+pi+" "+pii+" "+internet);
	}

}
