package aryav_programs;
import java.util.Scanner;
public class HCF_code {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a");
	int a = sc.nextInt();
	System.out.println("enter b");
	int b = sc.nextInt();
	int min=a<b?a:b;
	for(int i=min;i>=1;i--) {
		if(a%i==0 && b%i==0) {
			System.out.println("HCF "+i);
			return;
		}
	}
  }
}
