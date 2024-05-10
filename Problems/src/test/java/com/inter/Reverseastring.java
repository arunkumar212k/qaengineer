package com.inter;

public class Reverseastring {
	
	public static void main(String[] args) {
		String a = "arun";
		String b = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			b= b+a.charAt(i);
		}
		System.out.println(b);
		
		String original ="Arun";
		StringBuffer reversed = new StringBuffer(original);
		StringBuffer reverse = reversed.reverse();
		System.out.println(reverse);
		
		String org="Arun";
		StringBuilder reversed2 = new StringBuilder(org);
		StringBuilder Reversed2= reversed2.reverse();
		System.out.println(Reversed2);
	}
}