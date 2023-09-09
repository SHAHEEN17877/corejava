package inheritance;
interface Subject1{
	void displaySubject();
		
	}
   interface Subject2{
	   void displaySubject2();
   }
   interface syllabus1 extends Subject1,Subject2{
	   void displayChild();
	   
   }
   class  Syllabus implements syllabus1{

	@Override
	public void displaySubject() {
		// TODO Auto-generated method stub
		System.out.println("physics is my fvrt subject");
		
	}

	@Override
	public void displaySubject2() {
		// TODO Auto-generated method stub
		System.out.println("mathematics is my second fvrt subjet");
		
	}

	@Override
	public void displayChild() {
		// TODO Auto-generated method stub
		System.out.println("biology is my third fvrt subject");
		
	}
	   
   }

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Syllabus s=new Syllabus();
		s.displaySubject();
		s.displaySubject2();
		s.displayChild();
		
		
	}

}
