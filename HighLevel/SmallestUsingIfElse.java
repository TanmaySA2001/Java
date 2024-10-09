package HighLevel;

import java.util.Scanner;

public class SmallestUsingIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println("The smallest number is "+a);
		}
		else if(b<a && b<c) {
			System.out.println("The smallest number is "+b);
		}
		else {
			System.out.println("The smallest number is "+c);
		}
	}
}
