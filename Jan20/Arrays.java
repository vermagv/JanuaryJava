
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cases1=1;
		//int cases2=2;
	//	int cases3=3;
		int []cases= {1,2,3,4,500}; // explicit way of making an array
		System.out.println(cases); // will give hashcode of array because multi value container
		System.out.println(cases1); // will give actual value
		for(int element : cases)
		{
			System.out.println(element);
		}
		for(int i=0;i<cases.length;i++)
		{
			System.out.println(cases[i]);
		}
	}

}
