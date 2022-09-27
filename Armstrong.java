package com.assignment10;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter the number ");
		int number=scanner.nextInt();
		int temp=number;
		while(number!=0) {
		     int reminder=number%10;
		     sum=sum+(reminder*reminder*reminder);
		     number=number/10;
		     
		}
		
		if(sum==temp) {
			System.out.println(" is armstrong number ");
	      
		}else
			System.out.println( " is not armstrong number ");
	}

}

