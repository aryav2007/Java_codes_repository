package aryav_programs;
import java.util.Scanner;
public class Loop_ques {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumOfdigit=0;
		for(;n>0;) {
			int digit = n %10;
			n = n / 10;
			sumOfdigit += digit;
			
			
		}
		
		System.out.println(sumOfdigit);
	}
	 

}
