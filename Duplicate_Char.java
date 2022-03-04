package strings;

import java.util.*;

public class Duplicate_Char {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=obj.nextLine();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i),1);
			}
		}
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			if(((int)m.getValue())>1)
				System.out.println(m.getKey()+":"+m.getValue());
		}
		obj.close();
	}
}
