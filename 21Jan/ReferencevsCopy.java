
public class ReferencevsCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = a;    // value copy operation
		int a1[] = { 10,20,30,40 };
		int[] a2 = a1; // reference copy operation

		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		
		// value update operation
		 b = 30;
		 a1[2]= 20;     
	}

}
