package strings;
import java.util.*;
public class ValidShuffle {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String s1=obj.next();
		String s2=obj.next();
		String s=obj.next();
		String combs=s1+s2;
		ArrayList<Character> ch=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
			ch.add(s.charAt(i));
		if(combs.length()==s.length())
		{
			for(int i=0;i<combs.length();i++)
			{
				if(ch.contains(combs.charAt(i)))
					ch.remove(ch.indexOf(combs.charAt(i)));			
				else
				{
					System.out.println("Not Valid");
					break;
				}
			}
		}
		else
			System.out.println("Not Valid");
		if(ch.size()==0)
			System.out.println("Valid");
		obj.close();
	}
}