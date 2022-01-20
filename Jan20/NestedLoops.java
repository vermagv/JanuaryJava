
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char blackSquare='\u25A1';
		char whiteSquare='\u25A0';
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}else {
					char square = (j % 2) == 0 ? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}
				
			}
			System.out.println();
		}
	}

}
