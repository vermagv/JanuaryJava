
public class TwoDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] worldCovidCases= 	{
										{1234, 5435, 54353},
										{13123,6546,7686786},
										{84935,92103,12930},
										{9123,839248,9213012,3213},
									};
		
		System.out.println(worldCovidCases); // hashcode of 2d array
		System.out.println(worldCovidCases.length); // number of subarrays
		System.out.println(worldCovidCases[0]); // hashcode of first sub-array
		System.out.println(worldCovidCases[0].length); // number of elements of first sub-array
		
		
		for(int idx=0;idx<worldCovidCases.length;idx++)
		{
			System.out.println(worldCovidCases[idx]+" " +worldCovidCases[idx].length);
		}; // gives the hashcode of each subarray and number of elements in each subarray
	
	for(int i=0;i<worldCovidCases.length;i++)
	{
		for(int j=0; j<worldCovidCases[i].length ;j++)
		{
			System.out.print(worldCovidCases[i][j]+ " ");
		}
		System.out.println();
	}
	
	//create two-d array with size
	int[][] arrayy = new int[5][3]; // 5 number of sub-arrays with 3 elements in each subarray.
			arrayy[0][0]= 5;
			for(int[] XD : arrayy)     {                 // enhanced loop method for 2-d array
				for(int element : XD) {
	System.out.print(element+ " ");

						}
				System.out.println();
			}
			
	
	
	// create two-d array with size but number of elements in each array are undefined
	int [][] array = new int[5][] ;
	array[0]= new int [3];
	array[1]=new int[4];         // defining sizes
	array[2] = new int[5];
	array[3] = new int[5];
	array[4] = new int[5];
	
	for(int[] arr : array)
	{
		for(int element : arr)
		{
	
	System.out.print(element + " ");
	}
		System.out.println();
	}
	}
	
}
