package HighLevel;

import java.util.Scanner;

public class WeekdayClassificationUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number of which you want to find the day");
		int day = sc.nextInt();
		if(day > 7) {
			System.out.println("Give the number less than 8");
		}
		
		switch(day) {
		case 1:
			System.out.println("The first day is Monday");
			break;
		case 2:
			System.out.println("The second day is Tuesday");
			break;
		case 3:
			System.out.println("The third day is Wednesday");
			break;
		case 4:
			System.out.println("The fourth day is Thursday");
			break;
		case 5:
			System.out.println("The fifth day is Friday");
			break;
		case 6:
			System.out.println("The sixth day is Saturday");
			break;
		case 7:
			System.out.println("The seventh day is Sunday");
			break;
		default: 
			System.out.println("Invalid Input...");
		}
	}
}
