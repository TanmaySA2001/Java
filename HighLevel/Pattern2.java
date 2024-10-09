package HighLevel;

public class Pattern2 {
	public static void main(String[] args) {
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				System.out.print((j==1||j==5||(i+j==6&&i<=3)||(i==j&&i<=3))?i:" ");
			}
			System.out.println();}
	}
}

