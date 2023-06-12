package programming;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int n=2;
		boolean flag=true;
		flag=isPrime(n);
		if(flag)
		{System.out.println("prime number");
		}
			else {
				System.out.println("not prime");
			}
		
		
		
		}
		
	public static boolean isPrime(int n) 
	{
		boolean flag=true;
	for (int i = 2; i < n/2; i++) {
		if(n%i==0)
		{
			flag=false;
		}
		
	}return flag;
	}
	//int[] a={3,4,5,2,8,6}; print the prime numbers from array
	//print prime numbers from 1 -100
		
		
	}
	
	


