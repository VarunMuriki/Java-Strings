package strings;
import java.util.*;
public class RabinKarp {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		String f=obj.nextLine();
		int sl=s.length();
		int fl=f.length();
		for(int i=0;i<sl-fl+1;i++)
		{
		    if(s.substring(i,i+fl).equalsIgnoreCase(f))
		    {
		        System.out.println(i);
		    }
		}
		obj.close();
	}
}
