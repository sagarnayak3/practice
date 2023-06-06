package programming;

import java.util.Iterator;

public class Find1stMaximumNumberInArray {
	public static void main(String[] args) {
		int[] a= {5,4,3,1,2};
for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
				
			}
		}
			
			
			
		}
			System.out.print(a[a.length-1]+" is the maximum number");
			
			//to find sum of max 3 numbers
			int j=a[a.length-1]+a[a.length-2]+a[a.length-3];
			System.out.println(j);
			
			//to find the sum of first 3 min numbers
			int sum=0;
			for (int i = 0; i <3; i++) {
				sum=sum+a[i];
				
			}
			System.out.println("sum of first 3 is "+sum);
			
			//multiplication 
			int mul=1;
			for (int i = 0; i <3; i++) {
				mul=mul*a[i];
				
			}
			System.out.println("multiplication of first 3 is "+mul);
			
	}

}
