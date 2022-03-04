package strings;
import java.util.*;
public class BracketReversals {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Expression:");
		String s=obj.next();
		System.out.println(find(s));	
		obj.close();
	}
	public static int find(String s)
	{
		int left=0,right=0;
		if(s.length()%2!=0)
			return -1;
		else
		{
			for(int i=0;i<s.length();i++)
			{	
				if(s.charAt(i)=='{')
					left++;
				else
				{
					if(left==0)
						right++;
					else
						left--;		
				}
			}
		}	
		return (int)(Math.ceil(left/2)+Math.ceil(right/2));
	}
}
