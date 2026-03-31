package array_question;
import java.util.Scanner;
public class Array_2D_code {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int sum=0;
		int product=1;
		System.out.print("enter the rows: ");
		int row = sc.nextInt();
		System.out.print("enter the cols: ");
		int col = sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter the array elements:  ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
			 arr[i][j]=sc.nextInt();
			 sum+=arr[i][j];
				product*=arr[i][j];
		    }
		}
		System.out.println("sum of the array "+sum);
		System.out.println("product of the array "+product);
	}
}
