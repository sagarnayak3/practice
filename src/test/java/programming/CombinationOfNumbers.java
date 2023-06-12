package programming;

public class CombinationOfNumbers {
//Combination Of Numbers
	
	public static void main(String[] args) {
		int[] a= {1,3,8,2,9,4}; //combination should be 11
		
		int fn=0;
		int sn=0;
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i; j < a.length; j++) {
				if(a[i]+a[j]==11) {
					fn=a[i];
					sn=a[j];
					sum=a[i]+a[j];
					System.out.println(fn+" + "+sn+" = "+sum);
				}
				
			}
			
		}
		
	}
}
