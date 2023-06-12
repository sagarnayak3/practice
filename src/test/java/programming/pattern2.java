package programming;

public class pattern2 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <=5; i++)  // -> rows
		
		{
			for (int j = 1; j <=i; j++)  // -> columns
			{
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for (int i = 5; i >=1; i--)  // -> rows
			
		{
			for (int j = 1; j <=i; j++)  // -> columns
			{
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
	
			for (int i = 1; i <=5; i++)  // -> rows
			
		{
			for (int j = 1; j <=5; j++)  // -> columns
			{
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
			
			
			//    *
			//   **
			//  ***
			// ****
			//*****
			
			for (int i = 1; i <=5; i++)  // -> rows
				
			{
				for (int j = i; j <n; j++)  // -> columns
				{
					
					System.out.print(" ");
				}
				for (int j = 1; j <=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
				
			}
				for (int i = 1; i <=5; i++)  // -> rows
				
			{
					for (int j = 1; j <i; j++)// -> columns
				{
					
					System.out.print(" ");
				}
				
					for (int j = i; j <=n; j++)
					{
					System.out.print("* ");
				}
				System.out.println();
				
			}
	}

}
