package programming;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		for(;;) {
		Scanner s=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("		enter the number: ");
		int n=s.nextInt();
		int f=1;
		for (int i = 1; i <= n; i++) {
			f=f*i;
		}
		System.out.print("factorial of "+n+" is "+f);
	}
	}
}
