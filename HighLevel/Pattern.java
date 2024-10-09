package HighLevel;

public class Pattern {
	public static void main(String[] args) {
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if((j<2 || j>4) && i==1) {
					System.out.print("1");
				}
	
				else{
					System.out.print(" ");
				}
				
				if((j!=3) && i==2) {
					System.out.print("2");
				}
				else {
					System.out.print(" ");
				}
				if(((j<2 || j>4) || j==3) && i==3) {
					System.out.print("3");
				}
				else {
					System.out.print(" ");
				}
				if((j<2 || j>4) && i==4) {
					System.out.print("4");
				}
				else{
					System.out.print(" ");
				}
				if((j<2 || j>4) && i==5) {
					System.out.print("5");
				}
				else{
					System.out.print(" ");
				}
				
			}
			
			
		}
	}
}
