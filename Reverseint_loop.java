package aryav_programs;
import java.util.Scanner;
public class Reverseint_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z=0;
		for(;n>0;) {
			int digit = n %10;
			n = n / 10;
			z = z*10+digit;	
		}
		System.out.println(z);
	}
}
	 
