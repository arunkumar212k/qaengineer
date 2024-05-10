package problems;

import java.util.Iterator;

public class ReverseaString {
	//printing reverse, reverse a string, palindrome
	public static void main(String[] args) {
		String a = "Arun";
		String b = "";
		for(int i= a.length()-1;i>=0;i--) {
		b= b+ a.charAt(i);
		System.out.println(b);
			
		}
		
		System.out.println(b);
		if (a.equals(b)) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not a palindrome");
		}
	}
	

}
