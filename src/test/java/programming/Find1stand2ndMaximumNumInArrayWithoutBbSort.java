package programming;

public class Find1stand2ndMaximumNumInArrayWithoutBbSort {
	//Find 1st and 2nd Maximum Num In Array Without BbSort
	public static void main(String[] args) {
		int[] a= {2,5,4,7,66};
		int fmax=a[0];
		int smax=a[0];
		for (int i = 0; i < a.length; i++) {
			if (fmax<=a[i])
			{
				if(a[i]!=fmax) {
				smax=fmax;
				}
				fmax=a[i];
			}
			else if (smax == fmax || smax <a[i])
			{
				smax=a[i];
			}
			
		}
		System.out.println(fmax+" "+smax);

}
}
