package exception;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bot();
	}
	public static void bot() {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("Order confirmed");
			break;
		case 2:
			System.out.println("info@sololearn.com");
			break;
			default:
				System.out.println("Try again");
		}

	}

}
