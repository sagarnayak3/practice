package programming;

public class AdditionOf2Arrays {
//Addition Of 2 Arrays
	public static void main(String[] args) {
		int[]a= {0,5,1,2,0};
		int[]b= {3,4,5,1};
		
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		
		
		for (int i = 0; i <length; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.print(b[i]);
				}else {
					System.out.print(a[i]);
				}
				
			}
			
				
	
			
		}
		
	}
	
}
