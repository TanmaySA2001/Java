package HighLevel;

import java.util.Scanner;

public class ThreeNumbersComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Give three numbers");
	    System.out.println("Give the first number");
	    int a = sc.nextInt();
	    System.out.println("Give the second number");
	    int b = sc.nextInt();
	    System.out.println("Give the third number");
	    int c = sc.nextInt();
	    
	    System.out.print(a>b ? (a>c ? a:c): b);
	    System.out.println(" is the greatest number");
	    
	}
}
