package com.inter;

public class Occuranceofstring {
	public static void main(String[] args) {
		String string="Arun kumar";
		String subString="a";
		
		String[] parts =string.split(subString);
		System.out.println(parts);
		
		int count = parts.length-1;
		System.out.println(count);
	}

}
