package programming;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueCharecters {
//	Print Unique Charecters
	
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
			System.out.print(ch);
		}
	}

}
