import java.util.*;
class EndArray
{
	public static void main(String[] args)
	{
		int ar[] = {5,10,15,20};
		int element = 25;
		EndArray ea = new EndArray();
		int res[] = ea.add (ar, element);
			System.out.println(Arrays.toString(res));
		
		
	}
	int[] add (int ar[], int element )
	{
		int br[] = new int[ar.length+1];
		{
			for (int i=0; i<br.length-1; i++)
			{
				br[i]=ar[i];
				
			}
			br[br.length-1]= element;
			return br;
		}
	}
}