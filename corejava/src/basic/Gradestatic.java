package basic;

public class Gradestatic {

		static void calculateGrade(int marks) {
			if(marks>=90 && marks <=100) {
				System.out.println("A+");
			}
			else if(marks>=75 && marks <=90) {
				System.out.println("A");
			}
			else if(marks>=65 && marks <=75) {
				System.out.println("B+");
			}
			else if(marks>=50 && marks <=65) {
				System.out.println("B");
			}
			else if(marks>=35 && marks <=50) {
				System.out.println("FAIL");
			}
			
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Grades g=new Grades();
			calculateGrade(65);

		}

	


	}


