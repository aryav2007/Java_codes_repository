package practice_codes;
import java.util.Scanner;
public class ArrayAfterSubtracting_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result =0;
		System.out.println("entr the size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the element: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			result=result*10+arr[i];
		}
		int sub=result-1;
		String str=String.valueOf(sub);
		int arr2[]=new int [str.length()];
		for(int i=0;i<str.length();i++) {
			arr2[i]=str.charAt(i)-'0';
			System.out.print(arr2[i]+" ");
		}
		
	}
}
