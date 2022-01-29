
public class ArraySyntaxes {
	public static void main(String[] args)
	{
		// 1 and 2 are implicit, while 3 and 4 are explicit.
		int array1[]= {10,20,30,40,50};
		int[] array2= {10,20,30,40,50};
		int array3[]= new int[]{10,20,30,40,50};
		int[] array4= new int[]{10,20,30,40,50};
		// new keyboard allocates memory dynamically at runtime.
		
		System.out.println(array1);
		System.out.println();
		System.out.println(array2);
		System.out.println();
		System.out.println(array3);
		System.out.println();
		System.out.println(array4);
		
		int array5[] = new int[5];
		int[] array6 = new int[5];
		
		int a1[],a2;
		a1= new int[10];
		a2= 256;
		
		int[] a3,a4;
		a3= new int[5];
		a4= new   int[10];
	}
}