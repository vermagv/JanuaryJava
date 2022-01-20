
public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int myfloor = 5;
	for(int floor=1;floor<=10;floor++)
	{
		System.out.println("Current floor is "+floor);
		if(floor==myfloor)
		{
			System.out.println("Required floor reached.");
			break;
		}
	}
	for(int roll=1;roll<=10;roll++)
	{
		if(roll<=5)
		{
			continue;
		}
		System.out.println("Current Roll number is "+roll);
	}
	}
}
