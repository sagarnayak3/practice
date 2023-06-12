package programming;

import java.util.LinkedHashSet;

public class OccurenceOfCharecter {
//Occurence  Of Charecter
	public static void main(String[] args) {
		String str="Tester";
		str=str.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			
		}
		//System.out.print(set);
		
		for(Character ch:set)
		{
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
		System.out.println(ch+" is repeating "+count+" times");
		}
	}
	
}
