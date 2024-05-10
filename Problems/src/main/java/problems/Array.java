package problems;

import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		String[] cars = {"BMW","AUDI","BENZ"};
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		cars[2] = "ARUN";
		System.out.println(cars[2]);
		System.out.println(cars.length);
		for (int i = 0; i < cars.length; i++) {
			System.out.print(" "+cars[i]);
			
		}
		//for each syntax
		//	for (type variable : arrayname) {
		//		  ...
		//	}
		for(String i : cars) {
			System.out.println(i);
			
		}
		
		
	}

}
