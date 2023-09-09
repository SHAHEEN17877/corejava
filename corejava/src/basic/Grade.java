package basic;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=68;
		char result;
		result = mark>=80 ? 'A' :mark>=60 && mark < 80 ? 'B' :'C';
		System.out.println("result is "+result);

	}

}
