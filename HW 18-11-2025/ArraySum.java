class ArraySum
{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,5};
		int sum = 0;
		int i =0;
		ArraySum as = new ArraySum();
        int res = as.array(ar, sum, i);		
		System.out.println(res);
	}
	
	int array (int ar[], int sum, int i)
	{
	if(i==ar.length)
	{
		return sum;
	}
	sum = ar[i]+sum;
	return array (ar, sum, i+1);
	}
}