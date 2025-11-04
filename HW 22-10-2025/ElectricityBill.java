import java.util.Scanner;
class ElectricityBill
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Unit :");
		int unit=sc.nextInt();
		
		
		if (unit>=100)
		{
		System.out.println(unit*5);
		}
		
	else if (unit<=101 && unit>=200)
	{
		System.out.println(unit*7);
	}
			else
			{
				System.out.println(unit*10);
			}
	}
}