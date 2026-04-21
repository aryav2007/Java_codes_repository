package practice_codes;
import java.util.Scanner;
public class EvenElementinArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int check=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
