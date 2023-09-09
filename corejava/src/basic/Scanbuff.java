package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Scanbuff {
public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in); 
	System.out.println("enter your roll number: ");
	int rollno=scan.nextInt();
	System.out.println("Roll number is : "+rollno);
	System.out.println("enter your percentage: ");
	float percentage=scan.nextFloat();
	System.out.println("percentage: "+percentage);
	System.out.println("----Buffer Reader----");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your name : ");
	String fname=br.readLine();
	System.out.println("Full name: "+fname);
	System.out.println("enter your rollno: ");
	int rollno1=Integer.parseInt(br.readLine());
	System.out.println("Rollno: "+rollno1);
	

	}}


