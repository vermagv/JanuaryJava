
public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int indiaTotalCases= 413243;
		int indiaNewCases= 22354;
		int indiaNewRecovered= 73254;	
		
		
		int[] usaCases = {5421511, 62354, 53254};
		int[] indiaCases= {413243,22354,73254};	
		
		
		System.out.println(usaCases);
		System.out.println(indiaCases);	
		
	
		indiaCases[1] = 345411;	
		
		
		for(int idx=0;idx<usaCases.length;idx++)
		{
			System.out.print(usaCases[idx]+" ");
		}		
		
		System.out.println();
		
		for(int idx=0; idx<indiaCases.length;idx++)
		{	
			 System.out.print(indiaCases[idx]+" ");
		}
		System.gc(); // runs automatically collect unused objects and delete them.
		
	}

	
}
