package strings;
import java.util.*;
public class MinimumFlipstoAlternateBinary {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Binary:");
		String s=obj.next();
		obj.close();
		System.out.println(Math.min(flip(s,'0'), flip(s,'1')));
	}
	public static int flip(String s,char exp)
	{
		int fp=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=exp)
				fp++;
			exp=change(exp);
		}
		return fp;
	}
	public static char change(char c)
	{
		return (c=='0')?'1':'0';
	}
}
