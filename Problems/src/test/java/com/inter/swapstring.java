package com.inter;

public class swapstring {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("before swapping a is"+a);
		System.out.println("before swapping b is"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping a is"+a);
		System.out.println("after swapping b is"+b);
	}

}
