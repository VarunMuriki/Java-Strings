package strings;
import java.util.*;
public class WordBreak {
	static HashSet<String> h=new HashSet<>();
	public static void main(String[] args) {
		String dict[]={"mobile","samsung","sam","sung","man","mango","icecream","and","go","i","like","ice","cream"};
	    for(String i:dict)
	    h.add(i);
	    Scanner obj=new Scanner(System.in);
	    String s=obj.nextLine();
	    if(check(s))
	    System.out.println("YES");
	    else
	    System.out.println("NO");
	    obj.close();
	}
	public static boolean check(String s)
	{
	    int l=s.length();
	    if(l==0)
	    return true;
	    for(int i=0;i<=l;i++)
	    {
	        if(h.contains(s.substring(0,i)) && check(s.substring(i,l)))
	        return true;
	    }
	    return false;
	}

}
