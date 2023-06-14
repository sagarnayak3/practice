package programming;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class AditionOfNumbersInArrayWithoutDuplicates {
	public static void main(String[] args) {
		
		int[] a= {10,5,5,10,6,9}; 
		
		int sum=16;
		LinkedHashMap<Integer,Integer> map= new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==sum){
					if(map.containsKey(a[i])==false&&map.containsValue(a[i])==false)
						map.put(a[i],a[j]);
				}
			}
		}
			
		
		System.out.println(map);
		
	}

}
