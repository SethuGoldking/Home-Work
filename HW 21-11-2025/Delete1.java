import java.util.*;
class Delete1
{
	public static void main (String[] args)
	{
		int ar[] = {7,14,21,28,35};
		int val = 28;
		Delete1 d = new Delete1();
		int res[] = d.delete(ar,val);
		System.out.println(Arrays.toString(res));		
		
	}
	
	int[] delete (int ar[], int val)
	{
		int br[] = new int[ar.length-1];
		int index = 0;
		{
			for (int i=0; i<ar.length; i++)
			{
				if(ar[i]==val)
				{
					index = i;
					break;
				}
			}
			for (int i=0; i<=index-1;i++)
			{
				br[i]=ar[i];
			}
			for(int i=index; i<br.length;i++)
			{
				br[i]=ar[i+1];
			}
			return br;
		}
	}
	
}