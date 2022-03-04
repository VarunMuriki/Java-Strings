package strings;
import java.util.*;
public class Kmp {
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    String s=obj.next();
	    int n=s.length();
	    int max=0;
	    for(int i=0;i<n/2;i++)
	    {
	        if(s.substring(0,i+1).equalsIgnoreCase(s.substring(n-i-1,n)))
	        max=i+1;
	    }
	    System.out.println(max);
	    obj.close();
	}
}
