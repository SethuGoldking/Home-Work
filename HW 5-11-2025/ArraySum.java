import java.util.Scanner;
class ArraySum 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) 
		{
            System.out.print("Enter a Value: "+ ": ");
            arr[i] = sc.nextInt();
            sum = arr[i]+sum;
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}