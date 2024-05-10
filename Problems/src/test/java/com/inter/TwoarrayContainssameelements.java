package com.inter;

import java.util.Arrays;
import java.util.Iterator;

public class TwoarrayContainssameelements {
	public static void main(String[] args) {
		int  a[] ={1,2,3,4,5};
		int  b[] ={1,2,3,1,1};
		
	/*	boolean status = Arrays.equals(a,b);
		System.out.println(status);
		
		if(status==true) {
			System.out.println("Array is equal");
		}else {
			System.out.println("Array is not equal");
		}*/
		boolean status = true;
		if (a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if (a[i]!=b[i]) {
					status = false;
					
				}if (a[i]==b[i]) {
					status= true;
					
				}else {
					status = false;
				}
			}if (status== true) {
				System.out.println("Array is equal");
				
			}else {
				System.out.println("Array is not equal");
			}
			
		}
		
	}

}
