//usage of super variable and method overriding
package inheritance;
class Father{
	String name="modinsab";
	void disMethod() {
		System.out.println("Father class");
	}
}
class Son extends Father{
	String name="ashish";
	void displayName() {
		System.out.println("Parent name: "+super.name);
		System.out.println("Son name: "+name);
		}
  void disMethod() {
	super.disMethod();
	System.out.println("Son class");
}

  public class SuperVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s =new Son();
		s.displayName();
		s.disMethod();
}
}
}

