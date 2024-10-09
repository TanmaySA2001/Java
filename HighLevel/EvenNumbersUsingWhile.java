package HighLevel;

import java.util.Scanner;

public class EvenNumbersUsingWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the start number");
		int start = sc.nextInt();
		System.out.println("Give the end number");
		int end = sc.nextInt();
		
		int i = start;
		
		while(i<=end) {
			if(i%2 == 0) {
				System.out.println(i+" is even");
			}
			i++;
		}
		
	}
}
