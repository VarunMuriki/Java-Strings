package strings;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=obj.next();
		String rev="";
		for(int i=0;i<s.length();i++)
			rev=s.charAt(i)+rev;
		System.out.println(rev);
		obj.close();
	}
}
