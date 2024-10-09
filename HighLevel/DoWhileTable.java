package HighLevel;

import java.util.Scanner;

public class DoWhileTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number of table to be printed");
		int a = sc.nextInt();
		int i  = 1;
		
		do {
			System.out.println(a+" * "+i+" = "+(a*i));
			i++;
		}
		while(i<=10);
		
	}
}
