package programming;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class test {
	public static void main(String[] args) {
		
		int[] a= {10,5,5,10,6,9}; 
		
		int n1=0;
		int n2=0;
		LinkedHashMap<Integer,Integer> map= new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			map.put(a[i],i);
		}
		
		int[] b=new int[map.size()];
		
		for(Entry<Integer, Integer> f:map.entrySet())
		{
			
				for (int i = 0; i < map.size(); i++) {
					b[i]=f.getKey();
					
				}
				
			
			
		}
		
		for (int i = 0; i < b.length; i++) {
		 for (int j = 0; j < b.length; j++) {
			 if(b[i])
			
		}
			
		}
		
		
	}

}
