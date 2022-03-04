package strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Ënter a String:");
		String s=obj.next();
		int flag=1;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		obj.close();
	}
}
