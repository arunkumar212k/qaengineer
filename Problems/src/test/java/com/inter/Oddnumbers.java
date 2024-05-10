package com.inter;

import java.util.Arrays;
import java.util.List;

// List of odd numbers
public class Oddnumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		if(findOdd(list)) {
			System.out.println("the number is a odd number");
		} else {
            System.out.println("The list contains at least one even number.");
        }
    }
	
	
	public static boolean findOdd(List<Integer>list) {
		for(int l: list) {
			if(l%2==0) {
				return false;
			}
		}
		return true;
		
	}
	
	}


