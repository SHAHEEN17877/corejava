package collectionframework;

import java.math.BigInteger;
import java.util.Scanner;

public class StringMultiplication {
	public static String multiplyString(String num1, String num2) {
		BigInteger bigNum1 =new BigInteger(num1);
	    BigInteger bigNum2=new BigInteger(num2);
	    BigInteger result=bigNum1.multiply(bigNum2);
	    return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String num1=scan.nextLine().trim();
		String num2=scan.nextLine().trim();
		
	}

}
