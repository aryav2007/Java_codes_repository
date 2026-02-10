package aryav_programs;
import java.util.Scanner;
public class Primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=1) {
			System.out.println("not prime");
			return;
		}
		for(int check = 2 ; check < num ; check++) {
			if(num%check==0) {
			System.out.println("not prime");
			return;
		}	
	}
	System.out.println("prime");

	}
}
