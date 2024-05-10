package com.inter;

import java.util.Iterator;

public class Secondlargestnuminarray {
	private static int secLargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i : a) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			} else if (i > secondLargest) {
				i = secondLargest;

			}

		}
		return secondLargest;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println(secLargest(a));
	}

}
