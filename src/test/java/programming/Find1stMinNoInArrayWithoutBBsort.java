package programming;

public class Find1stMinNoInArrayWithoutBBsort {
//Find 1st Min No In Array Without BBsort
	
	public static void main(String[] args) {
		int[] a= {5,3,4,1,2};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("the fist min number in array is "+min);
		
		
	}
}
