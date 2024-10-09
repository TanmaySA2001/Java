package HighLevel;

import java.util.Scanner;

public class FindFactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a non negative number to calculate its factorial");
		int a = sc.nextInt();
		int factorial = 1;
		
		if(a == 0) {
			System.out.println("The factorial is 1");
		}
		else {
			for(int i=1; i<a+1; i++) {
				factorial = factorial*i;
			}
			System.out.println("The factorial for "+a+" is: "+factorial);
		}
		
		
	}
}
