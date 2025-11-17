class RepeatNum
{
	public static void main (String[] args)
	{
		int ar[] = {1,2,2,2,3,4};
		int target = 2;
		
		RepeatNum rn = new RepeatNum();
		int result = rn.num(ar,target);
		System.out.println(result);
	}
	
	
		int num (int ar[], int target)
		
		{
			int count = 0;
			for (int i = 0; i<ar.length; i++)
			{
				if(ar[i]==target)
				{
					count++;
				}
			}
			return count++;
		}
	
}