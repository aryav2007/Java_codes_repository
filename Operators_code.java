package aryav_programs;

public class Operators_code {
	public static void main(String[] agrs) {
		
		// arthematic Operators
		
		int num1=184;
		int num2=2;
		System.out.println("+ op "+ (num1+num2));//186
		System.out.println("- op "+ (num1-num2));//182
		System.out.println("* op "+ (num1*num2));//368
		System.out.println("/ op "+ (num1/num2));//92
		System.out.println("% op "+ (num1%num2));//0
		
		//   Relational (Compair) OP
		
		System.out.println(num1>num2);//true
		System.out.println(num1<num2);//false
		int number1=90;
		int number2=90;
		System.out.println(number1>=number2);//true
		number2=10;
		System.out.println(number1<=number2);//false
		System.out.println(number1!=number2);//true
		System.out.println(number1==number2);//false
		
		// Logical Operators

		//&&(and) : all true and true 
		//||(or) : anyone true and true 
		
		boolean bool1=true;
		boolean bool2=false;
		System.out.println(bool1 && bool2);
		if(bool1 && bool2) {
			System.out.println("hey");
		}
		else {
			System.out.println("Hello");
		}
		
		int numb1=13;
		int numb2=14;
		int numb3=3;
		if(numb1>numb2 &&  numb1>numb3) {
			System.out.println(numb1);
		}
		else if(numb1>numb2 ||  numb1>numb3) { 
			System.out.println(numb1);
		}
	}

}
