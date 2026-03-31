package array_question;
import java.util.Scanner;
public class CountinginArray_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int negative=0;
		int positive=0;
		System.out.println("enter the size: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<0) {
				negative++;
			}
			else {
				positive++;
			}
		}
		System.out.println("-ve numbers count: "+negative);
		System.out.println("+ve numbers count: "+positive);

	}

}
