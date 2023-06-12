package programming;

import java.util.LinkedHashSet;

public class PrintPositionsOfCharectersWithoutDuplicates {
//Print Positions Of Charecters With Duplicates
	
	public static void main(String[] args) {
		String str="Tester";
		str=str.toLowerCase();
		
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			
		}
		for(Character ch:set)
		{
			for (int i = 0; i < str.length(); i++) //can use (int i=str.length()-1;i>=0;i--)
				{
				if(ch==str.charAt(i))
				{
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
				}
			}
	
		
	}
	
	
}
