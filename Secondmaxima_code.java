package array_question;
import java.util.Scanner;
public class Secondmaxima_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the length");
		int len=sc.nextInt();
		int nums[]= new int[len];
		for(int i=0;i<len;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("enter the target");
		int target=sc.nextInt();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println("pairs for target is "+nums[i]+" "+nums[j]);
					System.out.println("index of pairs for target is "+i+" "+j);
				}
			}
		}
		
	}
}
