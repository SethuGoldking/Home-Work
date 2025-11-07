class Multiple
{
	public static void main(String[] args)
	{
		Multiple m = new Multiple();
		m.tables(10);
	}
	
	void tables (int a)
	{
		for (int i=1; i<=a; i++)
		{
			for (int j=1; j<=10;j++)
			{
				int ans=i*j;
				System.out.println(i+"*"+j+"="+ans);
			}
		}
	}
}