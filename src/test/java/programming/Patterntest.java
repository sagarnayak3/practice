package programming;

public class Patterntest {

	public static void main(String[] args) {
//	int n=6;
//	
//	for (int i = 0; i <n; i++) {
//		for (int j = n; j >=0; j--) {
//			if(i>=j)
//			{ 
//				System.out.print((char)('a'+j)+" ");
//			}
//			else
//			{
//				System.out.print(" ");
//			}	
//		}
//		System.out.println("");
//		}
		
//		
//		int n = 6;
//         // row
//		for (int i = 1; i <= n; i++) {
//			char ch = 'a';
//		//column
//			for (int j = n; j >= i; j--) {
//				System.out.print(ch);
//				ch++;
//			}
//			System.out.println();
		
		int n = 6;
        // row
		for (int i = 0; i <= n; i++) {
			char ch = 'a';
		//column
			for (int j = n; j >= i; j--) {
				System.out.print("  ");
//				ch++;
			}
		for (int j=1;j<=i;j++)
		{
			   System.out.print("* ");
		}
			System.out.println();

		}
	}
		
		
		
		
		
	
}
