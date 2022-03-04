package strings;

import java.util.Scanner;

public class LongestPalindrome {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Ënter a String:");
		String s=obj.next();
		int max=1,start=0;
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				flag=1;
				if(!(s.substring(i,j+1).equals(reverse(s.substring(i,j+1)))))
				{
					flag=0;
				}
				if(flag==1 && (j-i+1)>max)
				{
					start=i;
					max=j-i+1;
				}
			}
		}
		obj.close();
		System.out.println(s.substring(start,max+start));
	}
	public static String reverse(String s)
	{
		String rev="";
		for(int i=0;i<s.length();i++)
			rev=s.charAt(i)+rev;
		return rev;
	}

}
