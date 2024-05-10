package com.inter;

import java.util.Arrays;

public class Sortanarray {
	public static void main(String[] args) {
		int[] array = {-1,2,3,4,-5};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		int[] array2 = {1, 2, 3, -1, -2, 4};
		Arrays.sort(array2);

		System.out.println(Arrays.toString(array2));
	}

}
