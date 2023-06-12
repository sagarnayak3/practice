package programming;

import java.util.Scanner;

public class StringPalyndrome {
//String Palyndrome
	
	public static void main(String[] args) {
		for(;;)
		
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a word to check whether its palendrome or not: ");
		String str=s.next();
		str=str.toLowerCase();
		String rev="";
		for (int i =str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("The string is palendrome");
		}
		else
		{
			System.out.println("the string is not a palendrome");
		}
		}
		
	}
	
	
}
