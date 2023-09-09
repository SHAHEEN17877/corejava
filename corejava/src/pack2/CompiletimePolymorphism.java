//method overloading and polymorphism
package pack2;

public class CompiletimePolymorphism {
	void add(int a) {
		System.out.println("sum of : "+(a++));
	}
	void add(int a,int b) {
		System.out.println("sum of "+a+"+"+ b+":"+(a+b));
	}
	void add(int a,float b) {
		System.out.println("sum of "+a+"+"+ b+":"+(a+b));
	}
	void add(float a,float b) {
		System.out.println("sum of "+a+"+"+ b+":"+(a+b));
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	static void add(int x,int y,double z) {
		System.out.println("sum of "+x+"+"+ y+"+z+:"+(x+y+z));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompiletimePolymorphism p=new CompiletimePolymorphism ();
		p.add(30);
		p.add(3.4f,4.5f);
		p.add(05, 7.5f);
		p.add(3,40,90);
		p.add(65, 80);
		System.out.println("addition of number is: "+p.add(89,010, 60));
		CompiletimePolymorphism.add(23, 56,4000f);

	}

}
