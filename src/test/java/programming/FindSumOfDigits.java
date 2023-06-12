package programming;

public class FindSumOfDigits {
	
	public static void main(String[] args) {
		String s="a3b2d4";//9
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
				
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;

				sum=sum+n;
			
		}}
		
		System.out.print(sum);
	}

}



//if(Character.isDigit(s.charAt(i))&&Character.isDigit(s.charAt(j))){
//int n=s.charAt(i)-48;