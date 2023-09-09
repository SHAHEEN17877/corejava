//single inheritance,calling constructor in inheritance
package inheritance.copy;

class Demo {
	String name;
	int id;
 Demo(){
	 name="shaheen";
	 id=1;
 }
	void display() {
		System.out.println("name: " + name + " " + id);
	}
}

public class Demmo2 extends Demo {
	int i;

	void display1() {
		System.out.println(i);
	}

	public static void main(String[] args) {

		Demmo2 d1 = new Demmo2();
		d1.display();
	}
}
