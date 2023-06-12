package programming;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Swap1stAnd2ndWordsInAString {
	//Swap 1st And 2nd Words In AString
	public static void main(String[] args) {
		
	
	String st="I am a software engineer"; // Engineer am a software i
	String[] s=st.split(" ");
		
//	String temp=s[0];
//	s[0]=s[s.length-1];
//	s[s.length-1]=temp;
	for(int i = 0; i < s.length; i++) {
		//System.out.print(s[i]+" ");
		String t1=s[i];
		String rev="";
		//to reverse the words
		for (int j=t1.length()-1 ; j >=0; j--) {
			rev=rev+t1.charAt(j);
		}
		s[i]=rev;
		System.out.print(s[i]+" ");
	}
}
}



