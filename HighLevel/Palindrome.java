package HighLevel;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		String str1 = "";
		String str2 = "";
		
		for(int i=0; i<(str.length()/2); i++) {
			str1 = str1 + str.charAt(i);
			str2 = str2 + str.charAt(str.length()-1-i);
		}	
		if(str1.equals(str2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}
}
