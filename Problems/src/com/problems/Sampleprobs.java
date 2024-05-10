package com.problems;

public class Sampleprobs {

	public static void main(String[] args) {
		System.out.println("palindrome check");
		String a = "Arun";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(0);

		}
		System.out.println(b);
		if (a.equals(b)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
		
		System.out.println("reversed using Stringbuffer");
		String original = "barathanparanthaman";
		StringBuffer reversed = new StringBuffer(original);
		reversed = reversed.reverse();
		System.out.println("" + reversed);
		
		
		System.out.println("reversed using Stringbuilder");
		String original2 = "ArunkumarDuraisamy";
		StringBuilder reversed2 = new StringBuilder(original2);
		reversed2 = reversed2.reverse();
		System.out.println("the reversed string is " + reversed2);

		System.out.println("Fibbanocci series");
		int n1=0,n2=1,sum=0;
		for(int i=0;i<=10;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
			
		
		}
	}

}
