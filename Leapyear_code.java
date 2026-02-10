package aryav_programs;
import java.util.Scanner;
public class Leapyear_code {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the year");
	int year = sc.nextInt();
	
	if  (year%400==0){
		System.out.println("leapYear");
	}
	else if(year%4==0 && year%100!=0)  {
		System.out.println("leapYear");
	}
	else {
		System.out.println("normal year");
	}
}
}
