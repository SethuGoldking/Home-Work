import java.util.*;

class ArrayIns
{
	public static void main(String[] args)
	{
		int ar[] = {10,20,30,40,50};
		int pos = 2;
		int element = 99;
		
		ArrayIns as = new ArrayIns();
		int res[] = as.add(ar, pos, element); 
		System.out.println(Arrays.toString(res));
	}
	
	int[] add (int ar[], int pos, int element)
	{
	int br[] = new int[ar.length+1];
	
	
		for (int i = 0; i<pos-1; i++)
		{
			br[i]= ar[i];
		}
		br[pos-1]=element;
		for(int i=pos;i<br.length;i++)
		{
			br[i]= ar[i-1];
		}
	
	return br;
	}
}
