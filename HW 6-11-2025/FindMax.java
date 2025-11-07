class FindMax
{
	public static void main (String[] args)
	{
	FindMax f = new FindMax();
	int ans = f.max(10,20);
	System.out.println(ans);
	}
	int max (int a, int b)
	{
		int max =0;
		if (a<b)
		{
			max =b;
		}
		else
		{
			max=a;
		}
		return max;
	}
}