package programming;

public class StringArraySort {
	 public static void main(String[] args) {
	        String[] array = {"banana","basana", "apple", "orange", "grape"};
	        
	        // Sort the array
	        sortStringArray(array);
	        
	        // Print the sorted array
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
	    
	    public static void sortStringArray(String[] array) {
	        int n = array.length;
	        
	        // Perform bubble sort
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                // Compare adjacent elements and swap if necessary
	                if (array[j].compareTo(array[j + 1]) > 0) {
	                    String temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	
	
	
}
