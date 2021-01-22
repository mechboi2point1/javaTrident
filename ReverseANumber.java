package com.ibm.somename;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		int a=new Scanner(System.in).nextInt();
		table(a);
	}
	
	
	public static void sumOfDigits(int a) {
		
		
	}
	public static void table(int a) {
		int mul=1;
		for(int i=1;i<=a;i++) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
	

}
//123-->1+2+3=6
//509-->14
//when you know the range then use for loop when you a 
//atually dont know when loop will end or when the condition with be atained to terminate the loop
//6--> 1*2*3...*6=

//123456789