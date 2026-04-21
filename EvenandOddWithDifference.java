package practice_codes;
import java.util.Scanner;
public class EvenandOddWithDifference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		int evenCount=0;
		int oddCount=0;
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		int diff=Math.abs(evenCount-oddCount);
		System.out.println("total even no are "+evenCount);
		System.out.println("total even no are "+oddCount);
		System.out.println("diff between both is "+diff);


	}
}
