package aryav_programs;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte byteNumber=sc.nextByte();
		short shortNumber=sc.nextShort();
		long longNumber=sc.nextLong();
		int intNumber = sc.nextInt();
		float floatNumber=sc.nextFloat();
		char character=sc.nextLine().charAt(0);
		System.out.println("byte is "+byteNumber);
		System.out.println("short is  "+shortNumber);
		System.out.println("long is "+longNumber);
		System.out.println("int is "+intNumber);
		System.out.println("float is "+floatNumber);
		System.out.println("char is  "+character);
		
	}
}
