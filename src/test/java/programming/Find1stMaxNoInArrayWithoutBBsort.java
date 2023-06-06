package programming;

public class Find1stMaxNoInArrayWithoutBBsort {
	//Find1stMaxNoInArrayWithoutBBsort
	public static void main(String[] args) {
		int[] a= {5,3,4,1,2};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (max<a[i])
					{
				max=a[i];
					}
			
		}
		System.out.println("the maximum number is"+ max);
	}

}
