package com.assignment10;
import java.util.Scanner;
public class FabionacchiSerise {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number..");
		int number =scanner.nextInt();
		// in that the serise flow 0 1 ane sum of privesous number
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		for(int i=2;   i<=number; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}

}
