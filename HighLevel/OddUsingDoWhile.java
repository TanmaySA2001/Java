package HighLevel;

import java.util.Scanner;

public class OddUsingDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the start number");
		int start = sc.nextInt();
		System.out.println("Give the end number");
		int end = sc.nextInt();
		
		int i = start;
		do {
			if(i%2 != 0) {
				System.out.println(i+" is odd");
			}
			i++;
		}
		while(i<=end);
	}
}
