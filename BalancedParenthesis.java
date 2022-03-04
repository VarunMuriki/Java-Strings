package strings;

import java.util.*;

public class BalancedParenthesis {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a block of parenthesis:");
		String s=obj.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(st.empty())
				st.push(s.charAt(i));
			else if(s.charAt(i)==']' && st.peek()=='[')
				st.pop();
			else if(s.charAt(i)==')' && st.peek()=='(')
				st.pop();
			else if(s.charAt(i)=='}' && st.peek()=='{')
				st.pop();
			else 
				st.push(s.charAt(i));
		}
		if(st.empty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		obj.close();
		
	}
}
