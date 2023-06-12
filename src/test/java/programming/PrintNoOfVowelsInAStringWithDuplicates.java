package programming;

public class PrintNoOfVowelsInAStringWithDuplicates {
	//Print No Of Vowels In A String
 public static void main(String[] args) {
	
	 String st="bangalore";
	 char[] s=st.toCharArray();
	 int count=0;
	 for (int i = 0; i < s.length; i++) {
		// char j=null;
		 if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
		 {
			 count++;
			 //j=s[i];
			 System.out.println(s[i]);
		 }
		
	}
	 System.out.println("="+count);
}
}
