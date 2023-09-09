package java8;
@FunctionalInterface
interface Display{
	void Display();
}
public class MethodRefEx2 {
	public void myMethod() {
		System.out.println("Method reference in java8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRefEx2 obj=new MethodRefEx2();
		obj.myMethod();
		System.out.println("+++++++++++++++++++++++++++++++");
		Display ref=obj::myMethod;
		ref.Display();

	}

}
