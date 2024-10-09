package HighLevel;

import java.util.Scanner;

public class TablePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number for which the table needs to be printed");
		int a = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
