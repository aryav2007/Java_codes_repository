package array_question;
import java.util.Scanner;
public class SearchinginArray_code {
	//using loops and condition
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int count=0;
			int arrInt[] = new int[6];
			for(int index=0;index<arrInt.length;index++) {
				//System.out.println("enter the elements");
			  arrInt[index]=sc.nextInt();
			}
			for(int index=0;index<arrInt.length;index++) {
				System.out.print(arrInt[index]+" ");
			}
			int search = sc.nextInt();
			for(int index=0;index<arrInt.length;index++) {
				if(search==arrInt[index]) {
					System.out.println("true");
				}
				else if(search!=arrInt[index]){
					
					count++;
				}
				if(count>=arrInt.length) {
					System.out.println("no not found");
				}
				
				
				//if(search!=arrInt[index]) {
				//	System.out.println("false");
				
				//}
			}
		}
	}
