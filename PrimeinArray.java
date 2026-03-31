package array_question;
import java.util.Scanner;

public class PrimeinArray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Prime elements are:");
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int c = 0;
            for(int j = 1; j <= num; j++) {
                if(num % j == 0) {
                    c++;
                }
            }
            if(c == 2) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\nTotal Prime Numbers = " + count);
    }
}
