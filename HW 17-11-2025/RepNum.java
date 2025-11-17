class RepNum
{
	public static void main (String[] args)
	{
		int ar[] = {10,5,3,4,3,5,6};
		RepNum rp = new RepNum();
		System.out.println(rp.num(ar));
	}
	int num (int ar[])
	{
		for (int i=0; i<ar.length;i++)
		{
			for (int j=i+1; j<ar.length;j++)
			{
				if (ar[i]==ar[j])
				{
					return ar[i];
				}
			}
		}
		return -1;
	}
	
}
