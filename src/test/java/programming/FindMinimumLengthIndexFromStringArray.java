package programming;

public class FindMinimumLengthIndexFromStringArray {
//FindMinimumLengthIndexFromStringArray
	public static void main(String[] args) {
		String[] s= {"ab", "bcde" ,"hbvjk","ec","uyrik"};  //op : ab ec
		
		String min_length=s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>min_length.length())
			{
				min_length=s[i];
			}
			
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==min_length.length())
			{
				System.out.print(s[i]+" ");
			}
			
		}
		
		
		
		
	}
	
}
