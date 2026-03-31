package array_question;
import java.util.Scanner;
public class MaximainArray_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("enter the length");
		int n = sc.nextInt();*/
		int largestno=0;
		//int[] arr = new int[8];
		/*for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
		int arr[]= {11, 2256, 22564, 5547,556478};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestno) {
				largestno=arr[i];
			}
		}
		System.out.println("largest element is " +largestno);
	}
		
}
