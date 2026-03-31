package array_question;
import java.util.Scanner;
public class SumandAvgofArray_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the element: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("enter the numbers for array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		float avg=(float)sum/n;
		System.out.println("avg of array is "+avg+" sum of the array is "+sum);
	}

}
