package programming;

import java.util.LinkedHashSet;

public class PrintNoOfVowelsInAStringWithoutDuplicates {
	 public static void main(String[] args) {
			
		 String st="bangalore";
		 //char[] s=st.toCharArray();
		 int count=0;
		 LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		 for (int i = 0; i < st.length(); i++) {
			 set.add(st.charAt(i));
		 }
			 for(Character ch:set) {
					
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 {
					 count++;
					 //j=s[i];
					 System.out.println(ch);
				 }
				 }
			
//			 for (int i = 0; i < st.length(); i++) {
//				 
//			 }
			 System.out.println(st+"="+count);

		 
	 }
}
