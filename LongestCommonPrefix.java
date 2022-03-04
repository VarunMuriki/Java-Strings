package strings;
import java.util.*;
public class LongestCommonPrefix {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Number of Strings");
		int n=obj.nextInt();
		String a[]=new String[n];
		int l[]=new int[n];
		System.out.println("Enter Strings:");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.next();
			l[i]=a[i].length();
		}
		Arrays.sort(l);
		obj.close();
		int x=l[0];
		int max=0,flag=1;
		char ch;
		for(int i=0;i<x;i++)
		{
			ch=a[i].charAt(i);
			for(int j=1;j<n;j++)
			{
				if(a[j].charAt(i)!=ch)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				max++;
			else
				break;
		}
		System.out.println(a[0].substring(0,max));
	}
}
