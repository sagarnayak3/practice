package modify;

import org.testng.annotations.Test;

public class FreequencyTest {
	
	@Test
	public void FreequencyTest() {
		
		
		int[] a= {12,23,43,12,45,65,23,12,33};
		int l=a.length;
		boolean flag[]=new boolean[l];
		
		for(int i=0;i<l;i++) {
			int count=0;
			if(flag[i]==false) {
				for(int j=i;j<l;j++) {
					if(a[i]==a[j]) {
						count++;
						flag[j]=true;
					}//if ends
				}//j for ends
				
			}//if ends
			if(count!=0)
			System.out.println(a[i]+" present"+ count+"number of times");
		}
		
	}

}
