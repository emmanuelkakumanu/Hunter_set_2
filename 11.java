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
		String str=s.nextLine();
		String arr[]=str.split(" ");
		List<String> re=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			String temp=arr[i];
			String temp1=new String();
			for(int j=temp.length()-1;j>=0;j--)
			{
				temp1=temp1+temp.charAt(j);
			}
			re.add(temp1);
		}
		System.out.print(re.get(0));
		for(int i=1;i<re.size();i++)
		System.out.print(" "+re.get(i));
	}
}
