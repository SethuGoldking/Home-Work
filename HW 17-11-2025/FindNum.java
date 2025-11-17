class FindNum
{
public static void main (String[] args)
{
	int ar[] = {2,1,2,3,5,4,5,3,4};
	int target = 1,5;
	
	FindNum i = new FindNum();
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
				return ar[i];
			}
		}
	return count;
	
}
}