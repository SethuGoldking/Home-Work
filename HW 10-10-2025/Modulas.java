import java.util.Scanner;
class Increase
{
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to increase");
		int a=scan.nextInt();
		System.out.preantln("Enter the Percentage: ");
		int b=scan.nextInt();
		int c=a*b/100;
		int d=c+a;
		
		System.out.println("After"+b+" percentage increased price:"+d);
	}
}