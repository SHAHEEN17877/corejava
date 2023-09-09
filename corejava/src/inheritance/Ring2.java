//multilevel inheritance
package inheritance;

class Ring {
	void show() {
		System.out.println("its beautiful");
	}
}

	class Ring1 extends Ring{
		void Super() {
			System.out.println("it looks so great");
		}
		}
	public	class Ring2 extends Ring1{
			void yes() {
			System.out.println("do u want it");
		}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ring2 r=new Ring2();
		r.Super();
		r.show();
		r.yes();
}
}
