package strings;
import java.util.*;
class AllSubsequences {
	static List<String> al = new ArrayList<>();
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=obj.next();
		obj.close();
		findsubsequences(s, "");
		System.out.println(al);
	}
	private static void findsubsequences(String s,String ans)
	{
if (s.length() == 0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));
		findsubsequences(s.substring(1), ans);
	}
}
