//protected
package pack2;
import pack1.*;

public class Box2 extends Box1 {
	int i;
	public void display() {
		System.out.println(i);
	}
		public static void main(String[]args) {
			Box2 b=new Box2();
			b.displayColor();
	
}
}


