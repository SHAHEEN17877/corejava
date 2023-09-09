package abstraction;

abstract class AbstractEX2 {
	abstract void display();

	void show() {
		System.out.println("hello");
	}
	 static void show1() {
		System.out.println("hello hi");
	}
}

class AbstractChild extends AbstractEX2 {
	void display() {
		System.out.println("abstract child");
	}
}

class AbstractChild1 extends AbstractEX2 {
	void display() {
		System.out.println("Abstract child1");
	}
}

public class AbstractEX1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild1 ac = new AbstractChild1();
		ac.display();
		ac.show();
		AbstractChild ac1 = new AbstractChild();
		ac1.display();
		ac1.show();
       AbstractEX2.show1();
	}
}
