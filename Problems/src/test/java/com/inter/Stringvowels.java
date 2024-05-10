package com.inter;

public class Stringvowels {

	private static boolean FindVowels(String str) {
		str = str.toLowerCase();
		for(int i=0;i<=str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				return true;
				
			}
		}
		return false;

	}
	private static boolean Vowelsin(String Vowel) {
		return Vowel.matches(".*[aeiou]*.");
		

	}
	public static void main(String[] args) {
		String str ="Hellow World";
		Boolean Vowelsfind = FindVowels(str);
		System.out.println(Vowelsfind);
		System.out.println(FindVowels("dsff"));
		
		System.out.println(Vowelsin("Hello"));
		
	}
}
