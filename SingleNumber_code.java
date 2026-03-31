package array_question;
import java.util.Scanner;
public class SingleNumber_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		  //int prices[]=new int[6];
		  int prices[]= {7,1,5,3,6,4};
	        for(int i=0; i<prices.length; i++){
	            for(int j=i+1; j<prices.length; j++){
	                int profit=prices[j]-prices[i];
	                if(profit>max){
	                    max=profit;
	                    System.out.println(max);
	                }
	                else {
	                	System.out.println("0");
	                }
	               
	            }
	        }
	}

}
