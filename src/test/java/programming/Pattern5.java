package programming;

public class Pattern5 {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		for (int i = 1; i <=5; i++)  // -> rows
		
		{
			for (int j = 1; j <=i; j++)  // -> columns
			{
				
				System.out.print(i+" ");
				
			}
			count++;
			System.out.println();
			
		}
		
		for (int i = 1; i <=n; i++)  // -> rows
			
		{
				for (int j = 1; j <=i; j++)  // -> columns
			{
				
				System.out.print(" ");
			}
			
				for (int j = i; j <=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}

}
