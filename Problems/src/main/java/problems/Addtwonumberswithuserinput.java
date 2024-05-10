package problems;

import java.util.Scanner;

public class Addtwonumberswithuserinput {
	public static void main(String[] args) {
		int x;
		int y;
		int sum;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the first number");
		x = s.nextInt();
		System.out.println("please enter the second number");
		y= s.nextInt();
		
		sum = x+y;
		System.out.println("the sum of two numbers of the user input is:"+ sum);
		
		String s1 = "arun is a good boy";
		int counts1 = s1.split("\\s").length;
		System.out.println(counts1);
	}

}
