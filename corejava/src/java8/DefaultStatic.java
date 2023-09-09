package java8;
interface MyIntern1{
	void msg();
	default void display() {
		System.out.println("default method of interface");
	}
	static void displayStatic() {
		System.out.println("Static method");
	}
}
interface MyIntern2{
	void msg2();
}

public class DefaultStatic implements MyIntern1,MyIntern2{
	public static void main(String[]args) {
		DefaultStatic s=new DefaultStatic();
		s.msg();
		s.msg2();
		//s.display();
		MyIntern1.displayStatic();
		
	}

	@Override
	public void msg2() {
		// TODO Auto-generated method stub
		System.out.println("Static method");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("my abstarct method");
		
	}

}
