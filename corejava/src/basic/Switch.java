package basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		int number1,number2,result;
		Scanner scan=new Scanner(System.in);
		System.out.println("choose an operator: +,-,*, or /");
		operator = scan.next().charAt(0);
		System.out.println("operator==="+operator);
		
		//ask user to enter number
		System.out.println("enter first number");
		number1=scan.nextInt();
		
		System.out.println("enter second number");
		number2=scan.nextInt();
	//	operator=scan.next().charAt(0);
		switch(operator) {
		case'+':
			result=number1+number2;
			System.out.println(number1 +" I"+number2+" = "+result);
			break;
			
		case'-':
			result=number1-number2;
			System.out.println(number1 +" - "+number2+" = "+result);
			break;
		case'*':
			result=number1*number2;
			System.out.println(number1+" * "+number2+" = "+result);
			break;
		case'/':
			result=number1/number2;
			System.out.println(number1+" / "+number2+" = "+result);
			break;
		default:
			System.out.println("Invalid operator!");
		}
         scan.close();
	}

}
