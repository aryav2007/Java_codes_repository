package aryav_programs;
import java.util.Scanner;
public class FabonacciSeries_code {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int firstN=0;
		int secondN=1;
		for(int i=0;i<=n;i++) {
			System.out.print(firstN + " ");
			int sum = firstN+secondN;
			firstN=secondN;
			secondN=sum;
			
		}
	}

}
