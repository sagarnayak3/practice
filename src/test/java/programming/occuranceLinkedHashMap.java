package programming;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class occuranceLinkedHashMap {
	
	public static void main(String[] args) {
		
		String s="testyantra";
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			map.put(s.charAt(i), i);
		}
		for(Entry<Character,Integer>m:map.entrySet())
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(m.getKey()==s.charAt(i))
				{
					count++;
				}
			}
//			if(count>1)
//			{
//				System.out.println(m.getKey()+" is repeating "+count+" times");
//			}
			System.out.println(m.getKey()+" is repeating "+count+" times");
		}
		
		
		
		
	}

}
