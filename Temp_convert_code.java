package aryav_programs;
import java.util.Scanner;
public class Temp_convert_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temp");
		int temp = sc.nextInt();
		int kelvin = temp + 273;
		int fah = temp *5/9 + 32;
		System.out.println("temp converted to kelvin that is "+kelvin);
		System.out.println("temp converted to fah that is "+fah);	
	}
}