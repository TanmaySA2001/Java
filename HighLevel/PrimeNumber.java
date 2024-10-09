package HighLevel;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give any number to check");
		int a = sc.nextInt();
		
		for(int i=2; i<a/2; i++) {
			if(a%i == 0) {
				System.out.println("The number is not prime.");
				break;
			}
			else {
				System.out.println("The number is prime.");
				break;
			}
		}
	}
}
