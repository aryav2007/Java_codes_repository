package patterns_codes;

import java.util.Scanner;

public class Hollow_square_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the n");
		int n = sc.nextInt();
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				if(row==0 || row==n-1 || col==0|| col==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
