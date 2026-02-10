package aryav_programs;

import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			   // for (int i = 1; i <= n; i++){
			        if (n % 3 == 0 && n % 5 == 0) {
			            System.out.println("FizzBuzz");
			        }
			        else if (n % 3 == 0) {
			            System.out.println("Fizz");
			        }
			        else if (n % 5 == 0) {
			            System.out.println("Buzz");
			        }else {
			            System.out.println(n);
			       }
          }
}


/*  by Nested If...... 

			if(n%3==0)
			{
				if(n%5==0) {
					System.out.println("FizzBuzz");
				}
				System.out.println("fizz");
			}
*/
  

   



