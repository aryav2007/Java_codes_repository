package aryav_programs;

import java.util.Scanner;

public class Characterinput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Here I am taking user input in integer
		//int number =sc.nextInt();
		//sc.nextLine();
		char charaterInput = sc.nextLine().charAt(0);
		//char charaterInput = sc.next().charAt(0); 
		//System.out.println(number);
		System.out.println("User input charater "+charaterInput);
		
	}

}

