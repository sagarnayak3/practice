package programming;

public class SortArrayInDescendingOrderUsingBubbleSort {
	// Sort Array In Descending Order Using BubbleSort
	public static void main(String[] args) {
		int[] a= {5,4,3,1,2};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
				
			}
		}
			
			System.out.println(a[i]);
			
		}
		
	}

}
