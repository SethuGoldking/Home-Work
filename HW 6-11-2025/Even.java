class Even
{
	public static void main(String[] args)
	{
		Even e= new Even();
		boolean ans = e.Even(5);
		System.out.println(ans);
	}
	boolean Even (int a)
	{
		if (a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}