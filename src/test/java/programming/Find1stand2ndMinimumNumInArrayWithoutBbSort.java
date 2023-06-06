package programming;

public class Find1stand2ndMinimumNumInArrayWithoutBbSort {
	//Find 1st and 2nd Minimum Num In Array Without BbSort
	
	public static void main(String[] args) {
		int[] a= {2,5,4,7};
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
				smin=fmin;
				}
				fmin=a[i];
			}
			else if (smin==fmin || smin>a[i])
			{
				smin=a[i];
			}
			
			
		}
		System.out.println(fmin+" "+smin);
		
		
	}

}
