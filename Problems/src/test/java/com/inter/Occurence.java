package com.inter;

public class Occurence {
	public static void main(String[] args) {
		String a="as  daaaa dfgh";
		a=a.replace("a", "");
		System.out.println(a);
		String replaceAll = a.replaceAll("\\s", "");
		System.out.println(replaceAll);
	
	}
}
