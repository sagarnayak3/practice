package modify;

import org.testng.annotations.Test;

public class StringFrequencyTest {

		@Test
		public void StringFrequencyTest() {
			
			
			String a= "hello my hello  hello name is rahul my name rahul";
			String[] a1=a.toString().split(" ");
			int l=a1.length;
			boolean flag[]=new boolean[l];
			
			for(int i=0;i<l;i++) {
				int count=0;
				if(flag[i]==false) {
					for(int j=i;j<l;j++) {
						if(a1[i].equals(a1[j])) {
							count++;
							flag[j]=true;
						}//if ends
					}//j for ends
					
				}//if ends
				if(count!=0)
				System.out.println(a1[i]+" present "+ count+"  number of times");
			}
			
		}

	}


