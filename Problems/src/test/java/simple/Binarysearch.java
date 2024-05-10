package simple;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		Scanner s = new Scanner(System.in);
		System.out.println("pls enter the key");
		int key = s.nextInt();
		int lb = 0;
		int ub = a.length - 1;
		int notfound = 0;
		while (lb <= ub) {
			int mid = (lb + ub) / 2;
			if (a[mid] == key) {
				System.out.println("the element found is" + mid);
				notfound = 1;
				break;

			}
			if (a[mid] < key) {
				lb = mid + 1;
			}
			if (a[mid] > key) {
				ub = mid - 1;
			}

		}if(notfound==0) {
			System.out.println("Element not found");
		}

	}
}
