package com.inter;

import java.util.Iterator;

public class FizzBuzz {
	public static void main(String[] args) {
		int n = 20;
		StringBuilder s = new StringBuilder("{");
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				s.append("FizzBUZZ");
			} else if (i % 3 == 0) {
				s.append("Fizz");

			} else if (i % 5 == 0) {
				s.append("Buzz");

			} else {
				s.append(i);
			}
			if (i != n) {

				s.append(",");

			}

		}
		s.append("}");
		System.out.println(s);
	}
}