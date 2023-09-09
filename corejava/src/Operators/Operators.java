
package Operators;

public class Operators {
	int a=10;
	int b=20;
	int c,d,e,f,g;
	public void add() {
		c=a+b;
		System.out.println(c);
	
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=30;
		int f=20;
		int add=e+f;
		System.out.println("Arithmetic operations");
		System.out.println("Addition is : "+add);
		int sub=e-f;
		System.out.println("Substraction is : "+sub);
		int mul=e*f;
		System.out.println("multiplication is : "+mul);
		int div=e/f;
		System.out.println("Devision : "+div);
		int mod=e%f;
		System.out.println("modulus is : "+mod);
		
		System.out.println("unary operators");
		int z=e++;
		System.out.println("increment is : "+z);
		int w=++e;
		System.out.println("pre increment is : "+w);
		int g=e--;
		System.out.println("post decrement : "+g);
		int m=--f;
		System.out.println(" preDecrement is : "+m);
		
		System.out.println("shift operators");
		int y=e>>f;
		System.out.println("rightshift is :"+y);
		int x=e<<f;
		System.out.println("Leftshift value is :"+x);
		
		System.out.println("logical operators");
		System.out.println("e!=f : "+(e!=f));
		System.out.println("e|f : "+(e|f));
		System.out.println("e&f "+(e&f));
		
		System.out.println("Relational operators");
		System.out.println("e>f :"+(e>f));
		System.out.println("e<f :"+(e<f));
		System.out.println("e==f :"+(e==f));
		System.out.println("e!=f :"+(e!=f));
		
		System.out.println("Terinary operator ");
		int max=e>f?e:f;
		System.out.println("max :"+max);
		int min=e<f?e:f;
		System.out.println("min :"+min);
	
		
		
		

	}

}
