
package basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int ar[]=new int[10];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			System.out.println("enterthe element at "+ i+ "index position");
			ar[i]=scan.nextInt();
		}
		System.out.println("original array:");
		for(int i=0;i<ar.length;i++);
		{
			System.out.print(ar[i]+ " ");
			{
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println("reverse order array:");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+ " ");
		}
	

	}

}
