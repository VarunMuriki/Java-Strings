package strings;

import java.util.Scanner;

public class SplitEqualBinary {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=obj.next();
		int count0=0,count1=0,count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
				count0++;
			else if(s.charAt(i)=='1')
				count1++;
			if(count1==count0)
				count++;
		}
		if(count1!=count0)
			System.out.println("-1");
		else
			System.out.println(count);
		obj.close();
	}
}
