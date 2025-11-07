class PosNeg
{
public static void main(String [] args)
{
PosNeg pn = new PosNeg();
int ar[] = {12,18,-2,-36,45,-21,1};
pn.check(ar);

}
void check (int  ar[])
{
	for (int i =0;i<ar.length;i++)
	{
		if(0<ar[i])
		{
			System.out.println("Positive Number "+ar[i]);
		}
		else if(ar[i]<0)
		{
			System.out.println("Negative Number "+ar[i]);
		}
	}
}
}