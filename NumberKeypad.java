package strings;
import java.util.*;
public class NumberKeypad {
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    String s=obj.next();
	    String str[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String output="";	   
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)==' ')
	        output=output+"0";
	        else
	        {
	            int pos=s.charAt(i)-'A';
	            output=output+str[pos];
	        }
	    }
	    System.out.println(output);
	   obj.close();
	}

}
