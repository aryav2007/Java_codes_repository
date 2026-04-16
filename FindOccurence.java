package string_codes;
import java.util.Scanner;
public class FindOccurence {
	//find the no. of occurence of bob in a string a consisting of Lowercase english alphabet;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int count=0;
	for(int i=0;i<a.length()-2;i++) {
		char ch=a.charAt(i);
		if(ch=='b' && ch=='o' && ch=='b') {
			System.out.println(count);
		}
		count++;
	}
   }
}
