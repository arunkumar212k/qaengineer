package com.inter;
import java.util.*;

public class Fibonacci {
	 public static void main(String[] args)  {

	        Scanner scan = new Scanner(System.in);
	       int N = scan.nextInt();
		
	        int result =0;

	        for(int i =1; i<=10;i++){
	            result=N*i;
	            System.out.println(N+" x "+i+" = "+result);  
	   
	        }
	       
	    }
}
