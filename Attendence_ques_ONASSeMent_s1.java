package practice_codes;
import java.util.Scanner;
public class Attendence_ques_ONASSeMent_s1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		int rollNo[]=new int[n];
		System.out.println("enter the element: ");
		for(int i=0;i<n;i++) {
			rollNo[i]=sc.nextInt();
			sum+=rollNo[i];
		}
		int expectedSum=n*(n+1)/2;
		int min=expectedSum-sum;
		if(expectedSum!=min) {
			System.out.println("the absent roll no:  "+min);
		}
	}
}
