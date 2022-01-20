// Labelled break and continue
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myfloor=5;
		loop1:
			for(int floor=1;floor<=10;floor++)
			{
				
				System.out.println("Current floor is "+floor);
				if(floor==myfloor)
				{
					System.out.println("floor reached");
					break loop1;			
				}
			}
	loop2:
		for(int roll=1;roll<=10;roll++)
		{
			if(roll<=5)
			{
				continue loop2;
			}
			System.out.println("Currently roll number "+roll);
		}
	}
}
