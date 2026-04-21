package practice_codes;
import java.util.Scanner;
public class ConvertCharintoString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			//count++;
			if(ch!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
