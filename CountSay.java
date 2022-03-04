package strings;
import java.util.*;
public class CountSay {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Ënter a String:");
		String s=obj.next();
		HashMap<Character,Integer> map=new HashMap<>();
		ArrayList<Character> h=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
					
			else
			{
				h.add(s.charAt(i));
				map.put(s.charAt(i),1);
			}
		}
		for(char c:h)
		{
			System.out.print(map.get(c)+""+c);
		}
		obj.close();	
	}
}
