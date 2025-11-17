class Index
{
public static void main (String[] args)
{
	int ar[] = {5,7,7,8,8,10};
	int target = 8;
	
	Index i = new Index();
	int result =  i.num(ar,target);
    System.out.println(result);
	
	
	
}
int num (int ar[], int target)
{
	int count = 0;
	
		for (int i =0; i<ar.length; i++)
		{
			if(ar[i]==target)
			{
				count = i;
			}
		}
	return count;
	
}
}
