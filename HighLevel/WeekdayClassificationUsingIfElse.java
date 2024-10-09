package HighLevel;

import java.util.Scanner;

public class WeekdayClassificationUsingIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the day");
		int day = sc.nextInt();
		
		if(day == 1) {
			System.out.println("The day is Monday");
		}
		else if(day == 2) {
			System.out.println("The day is Tuesday");
		}
		else if(day == 3) {
			System.out.println("The day is Wednesday");
		}
		else if(day == 4) {
			System.out.println("The day is Thursday");
		}
		else if(day == 5) {
			System.out.println("The day is Friday");
		}
		else if(day == 6) {
			System.out.println("The day is Saturday");
		}
		else if(day == 7) {
			System.out.println("The day is Sunday");
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}
