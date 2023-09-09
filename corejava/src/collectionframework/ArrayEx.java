package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

 class ArrayEx1 {
	int sNo;
	String sName;
	String sGrade;

	public ArrayEx1(int sNo, String sName, String sGrade) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sGrade = sGrade;
	}
}

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<ArrayEx1> alist=new ArrayList<ArrayEx1>();
		int choice;
		do {
			System.out.println("Enter your choice :--> 1to 2 or or 4");
			choice=scan.nextInt();
			switch(choice) {
			case 1://enter student details
				System.out.println("enter student details.........");
				System.out.println("enter student roll no....");
				int sNo=scan.nextInt();
				System.out.println("enter studnt name");
				String sName=scan.next();
				System.out.println("enter student grade");
				String sGrade=scan.next();
				alist.add(new  ArrayEx1(sNo,sName,sGrade));
				break;
			case 2:
				System.out.println("enter student details.........");
				for(ArrayEx1 st: alist) {
					System.out.println("student rollno: "+st.sNo);
					System.out.println("student name: "+st.sName);
					System.out.println("student grade: "+st.sGrade);
					System.out.println("========================");
				}
				break;
			case 3://to delete student details
				System.out.println("enter index to remove student details......");
				int n=scan.nextInt();
				alist.remove(n);
				break;
			case 4:
				default: System.out.println("invalid choice...........");
			
			}
		} while(choice!=4);
			scan.close();
		}
	}

	
