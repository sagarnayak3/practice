package programming;

import org.testng.reporters.jq.Main;

public class PrimeNoFrom1to100 {
	
	public static void main(String[] args) {
		
		boolean flag=true;
		for (int i = 1; i <=100; i++) {
		flag=isPrime(i);
		
		if(flag)
			System.out.println(i+" is prime");
		//else
			//System.out.println(i+" is not prime");
			}
		}
	
	//user defined method
	public static boolean isPrime(int n) {
		boolean flag=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				flag=false;
		}
		return flag;
	}
	
	}


/*int count=0;
for (int j = 1; j <=i; j++) {
	if(i%j==0)
	{
		count++;
	}
}
if(count==2)
{
	System.out.println(i);*/