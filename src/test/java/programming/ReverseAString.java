package programming;

public class ReverseAString {
	//Reverse A String
	
	public static void main(String[] args) {
		String str="Harshitha";
		String rev="";
		
		//my test
//		for (int i = str.length()-1; i>=0; i--) {
//			
//			char ch=str.charAt(i);
//			rev=rev+ch;
//			System.out.print(str.charAt(i));
//		}
//		System.out.print(rev);
		
		//2
//		char[] st=str.toCharArray();
//		for (int i = st.length-1; i>=0; i--) {
//			System.out.print(st[i]);
//			
//		}
		
		//3
//		char[] st=str.toCharArray();
//		int count=0;
//		for(char c:st)
//		{
//			count++;
//		}
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.print(st[i]);
//		}
		
		//5
		StringBuilder s=new StringBuilder(str);
		System.out.print(s.reverse());
		
		
		
	}
		
		

}
