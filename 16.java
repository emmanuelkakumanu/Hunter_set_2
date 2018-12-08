import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		Arrays.sort(a);
		List<Integer> lst=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(a[i]!=k)
			{
				lst.add(a[i]);
			}
		}
		System.out.print(lst.get(0));
		for(int i=1;i<3;i++)
		System.out.print(" "+lst.get(i));
		
	}
}
