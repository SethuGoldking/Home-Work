import java.util.*;
class SecondMax
{
	public static void main (String[] args);
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the Elements:");
		for (int i = 0; i< n; i++);
		{
			arr[i]=sc.nextInt();
		}
	Arrays.sort(arr);
if(n<2)
{
System.out.print("Array must has atleast 2 numbers:");
}
else
{
System.out.print("Second Max number is:"+ arr[n-2]);
}	
	}
}
