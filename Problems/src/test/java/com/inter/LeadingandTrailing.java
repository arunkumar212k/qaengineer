package com.inter;

public class LeadingandTrailing {
	public static void main(String[] args) {
		String a ="   adlfkjaldf   djsadf"
			;
		a = a.trim();
		System.out.println(a);
		
		String s = "  abc  def\t";
		
		s = s.strip();
				
		System.out.println(s);
	}

}
