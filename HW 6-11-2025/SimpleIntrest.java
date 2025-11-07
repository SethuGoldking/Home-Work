class SimpleIntrest
{
	public static void main(String[] args)
	{
		SimpleIntrest si = new SimpleIntrest();
		float ans = si.sum(5, 10, 15);
		System.out.println(ans);
	}
	
		float sum(int p, int n, int r)
		{
			float yr = r/365.0f;
			float res = (p*n*yr)/100.0f;
			return res;
		}
	
}