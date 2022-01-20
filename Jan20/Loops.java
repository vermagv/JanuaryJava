
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char black='\u25A1';
		char white='\u25A0';
		
		int indexw=1;
		while(indexw<=4)
		{
			System.out.println(black+" "+white);
			indexw++;
		}
		int indexdw=1;
		do {
			System.out.println(black+" "+white);
			indexdw++;
		}
		while(indexdw<=4);
		for(int indexf=1;indexf<=4;indexf++)
		{
			System.out.println(black+" "+white);
		}
	}

}
