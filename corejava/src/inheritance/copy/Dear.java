//heirarchical inheritance
package inheritance.copy;
 
class A {
	void display() {
		System.out.println("hi.......");
	}
}
    class B extends A {
		void show() {
			System.out.println("how are you....");
		}
	}

	class C extends A {
		void image() {
			System.out.println("are you ok");
		}
	}

	public class Dear extends A {
		void photo() {
			System.out.println("ohh!!! its nice to hear");
		}
	

 public static void main(String[] args) {
    	Dear d=new Dear();
    	d.display();
    	B b=new B();
    	b.show();
    	C c=new C();
    	c.image();
    	d.photo();
	}
    }



