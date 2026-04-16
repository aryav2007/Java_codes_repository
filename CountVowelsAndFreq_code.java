package practice_codes;
import java.util.Scanner;
public class CountVowelsAndFreq_code {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("enter String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				c++;
			}
		}
		System.out.println(c);
		
	}
}
