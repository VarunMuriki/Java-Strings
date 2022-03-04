package strings;
import java.util.*;
public class Roman_Decimals {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Roman Value:");
		String s=obj.next();
		obj.close();
		int ans=0;
		int r1=0,r2=0;
		for(int i=0;i<s.length();i++)
		{
			r1=value(s.charAt(i));
			if(i+1<s.length())
			{
				r2=value(s.charAt(i+1));
				if(r1>=r2)
					ans+=r1;
				else
				{
					ans+=r2-r1;
					i++;
				}
			}
			else
				ans+=r1;
		}
		System.out.print(ans);
	}
	static int value(char c)
	{
		if(c=='I')
			return 1;
		else if(c=='V')
			return 5;
		else if(c=='X')
			return 10;
		else if(c=='L')
			return 50;
		else if(c=='C')
			return 100;
		else if(c=='D')
			return 500;
		else if(c=='M')
			return 1000;
		return -1;
	}
}
