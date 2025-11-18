class FindMax
{
	public static void main (String[] args)
	{
		int ar[] = {1,2,3,4,3,2,1};
		int i = 0;
		int max = 0;
		
		FindMax fm = new FindMax();
		System.out.println(fm.num(ar,0,0)); 
		
	}
	int num (int ar[], int max, int i)
	{
		if(i<ar.length)
		{
			if (max<ar[i])
			{
				max= ar[i];
			}
			return num (ar, max, ++i );
		}
			return max;
	
	}
}
	