
public class methodIntroduction {
	void maxElement(int[] array)
	{
		int max = array[0];
		for(int element : array)
		{
			if(element>max)
			{
				max=element;
			}
			System.out.print(element);
		}
	}
	static void maxElementz(int[] array)
	{
		int max = array[0];
		for(int element : array)
		{
			if(element>max)
			{
				max=element;
			}
			System.out.print(element);
		}
	}
		
	public static void main(String[] args) {
		

		int[] productionPrices = {3812,38429,8925,9320};
		int max = productionPrices[0];
		for (int element : productionPrices)
		{
			if (element>max)
			{
				max = element ;
			}
		}
		System.out.println(max);
		// Instead of repeating lines everytime, make a method instead.
		
		int[] covidCases= {123,12312,4432,324};
		methodIntroduction refVar= new methodIntroduction(); //object creation 
		refVar.maxElement(covidCases); // executing non static
		methodIntroduction.maxElementz(covidCases); // executing static
		
		
	
	}

}
