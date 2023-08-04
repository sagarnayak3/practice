package programming;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class OccuranceOfWordsInAString {

	public static void main(String[] args) {
		
		
		String st="i am a software engineer testing engineer i"; 
		String[] s=st.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
			
		}
		boolean[] flag=new boolean[s.length];
		for (int i = 0; i < s.length; i++) {
		int ccont=0;
		if(flag[i]==false) {
		for (int j =i; j < s.length; j++) {
			if(s[i].equalsIgnoreCase(s[j]))
			{
				ccont++;
				flag[j]=true;
			}
		}
		System.out.println(s[i]+" is repeating "+ccont+" times");
		}
		
		}
		
}
}

