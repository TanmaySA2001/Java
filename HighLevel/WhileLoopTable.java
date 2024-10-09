package HighLevel;

import java.util.Scanner;

public class WhileLoopTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number for which the table needs to be printed");
		int a = sc.nextInt();
		int i = 1;
		
		while(i<=10) {
			System.out.println(a+" * "+i+" = "+(a*i));
			i++;
		}
		
	}
}
