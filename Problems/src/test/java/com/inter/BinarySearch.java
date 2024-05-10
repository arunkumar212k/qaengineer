package com.inter;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the key element");
		int key = s.nextInt();

		int lb = 0;
		int ub = a.length - 1;
		int notFound = 0;

		while (lb <= ub) {
			int mid = (lb + ub) / 2;
			if (a[mid] == key) {
				System.out.println("The element found is " + mid);
				notFound = 1;
				break;
			}
			if (a[mid] < key) {
				lb = mid + 1;
			} 
			if (a[mid] > key)	{
				ub = mid - 1;
			}

		}
		if (notFound == 0) {
			System.out.println("The element not found");
		}
	}

}
