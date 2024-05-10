package com.inter;

public class FactorialP {
	public static long findFactorial(long n) {
		if (n==1||n==0) {
			return 1;
			
		}else {
			return (n*findFactorial(n-1));
		}
		
		
	}
	public static void main(String[]args) {
		System.out.println(findFactorial(7));
		System.out.println(findFactorial(1));
	}

}
