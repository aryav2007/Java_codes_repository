package array_question;
import java.util.Scanner;
public class Array_input_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arrInt[] = new int[a];
		/*arrInt[0]=sc.nextInt();
		arrInt[1]=sc.nextInt();
		arrInt[2]=sc.nextInt();
		arrInt[3]=sc.nextInt();
		arrInt[4]=sc.nextInt();*/
		for(int index=0;index<arrInt.length;index++) {
			arrInt[index]=sc.nextInt();
		}
		for(int index=0;index<arrInt.length;index++) {
			System.out.print(arrInt[index]+" ");
		}
		
		
	}
}
