class FindMin
{
	public static void main (String[] args)
	{
		int ar[] = {1,2,3,4,5,6,7,8};
		int i = 0;
		int min = ar[0];
		
		FindMin fm = new FindMin();
		System.out.println(fm.num(ar,min,i)); 
		
	}
	int num (int ar[], int min, int i)
	{
		if(i<ar.length)
		{
			if (min>ar[i])
			{
				min= ar[i];
			}
			return num (ar, min, ++i);
		}
			return min;
	
	}
}
	