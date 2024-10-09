package HighLevel;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the month number");
		int month = sc.nextInt();
		System.out.println("Select the year");
		int year = sc.nextInt();
		
		if(month < 9) {
			System.out.println("The month and year which you have selected is: 0"+month+"/"+year);
		}
		else {
			System.out.println("The month and year which you have selected is: "+month+"/"+year);
		}
		System.out.println("Finding the days in the month");
		
		switch (month) {
		case 1:
			System.out.println("The month have 31 days");
			break;
		case 2 :
			if(month/4 == 0 && month/100 != 0) {
				System.out.println("The month have 29 days");
			}
			if(month/100 == 0 && month/400 == 0) {
				System.out.println("The month have 29 days");
			}
			else {
				System.out.println("The month have 28 days");
			}
			break;
		case 3:
			System.out.println("The month have 31 days");
			break;
		case 4:
			System.out.println("The month have 30 days");
			break;
		case 5:
			System.out.println("The month have 31 days");
			break;
		case 6:
			System.out.println("The month have 30 days");
			break;
		case 7:
			System.out.println("The month have 31 days");
			break;
		case 8:
			System.out.println("The month have 31 days");
			break;
		case 9:
			System.out.println("The month have 30 days");
			break;	
		case 10:
			System.out.println("The month have 31 days");
			break;
		case 11:
			System.out.println("The month have 30 days");
			break;
		case 12:
			System.out.println("The month have 31 days");
			break;	
		}
			
		
		
		
		
	}
}
