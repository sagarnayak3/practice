package programming;

public class Append0sAtLastInAnArray {
	//Append 0s At Last In An Array
	public static void main(String[] args) {
		
	
	int[] a= {0,1,1,0,1}; // 1 1 1 0 0
	int[] b=new int[a.length];
	int m=0;
	int n=a.length-1;
	for (int i = 0; i < a.length; i++) {
		if(a[i]!=0)
		{
			b[m]=a[i];
			m++;
			
		}else {
			b[n]=a[i];
			n--;
					
		}
	}
	
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	
	
		
}
	

}
