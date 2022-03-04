package strings;

import java.util.Scanner;

public class Rotation {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=obj.next();
		System.out.print("Enter a Check String:");
		String c=obj.next();
		if((s+s).contains(c))
			System.out.println("Rotation");
		else
			System.out.println("Not a Rotation");
		obj.close();
	}
}
