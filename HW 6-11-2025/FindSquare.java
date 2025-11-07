class FindSquare
{
public static void main(String[] args)
{
FindSquare sq = new FindSquare();
int ans = sq.square(5);
System.out.println(ans);
}
int square(int a)
{
	int ans = a*a;
	return ans;
}
}