
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
		Stack st=new Stack();
		for(int i=0;i<str.length();i++)
		st.push(str.charAt(i));
		
		String re=new String();
		for(int i=0;i<str.length();i++)
		re=re+st.pop();
		
		
		
		if(re.equals(str))
		System.out.print("YES");
		else
		System.out.print("NO");
	}
}
