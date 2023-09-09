package basic;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
   System.out.println("enter your number");
   int num=scan.nextInt();
   String result=(num%2==0)?"Even" :"Odd";
   System.out.println("Number is "+result);
	}

}
