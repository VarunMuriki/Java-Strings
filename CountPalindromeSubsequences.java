package strings;
import java.util.*;
public class CountPalindromeSubsequences {
	static int count=-1;
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=obj.next();
		obj.close();
		find(s,"");
		System.out.println(count);
	}
	public static void find(String s,String ans)
	{
		if(s.length()==0)
		{
			palin(ans);
			return;
		}
		find(s.substring(1),ans+s.charAt(0));
		find(s.substring(1),ans);
	}
	public static void palin(String s)
	{
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				return;
			}
		}
		count++;
	}
}
