	import java.util.*;

	class Delete
	{
		public static void main(String[] args)
		{
			int ar[] = {1,2,3,4,5};
			int pos =3;
			Delete d = new Delete();
			int res[] = d.del(ar,pos);
			System.out.println(Arrays.toString(res));
			
		}
		 
		 int[] del (int ar[], int pos)
		 {	 
		 int br[] = new int[ar.length-1];
		 for (int i = 0; i<pos-1; i++)
		 {
			 br[i]=ar[i];
		 }
		 for (int i=pos-1; i<br.length; i++)
		 {
			 br[i]=ar[i+1];
		 }
		 return br;
		}
	}	