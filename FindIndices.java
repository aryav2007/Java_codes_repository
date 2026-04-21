package practice_codes;
import java.util.Scanner;
public class FindIndices {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target");
		int target=sc.nextInt();
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int first=-1;
		int last=-1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			if(arr[i]-arr[j]==target) {
				first=i;
				last=j;
			}
		}
		System.out.println(first+" "+last);
	}
}
