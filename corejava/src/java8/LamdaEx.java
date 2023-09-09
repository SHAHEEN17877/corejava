package java8;

 interface MyInterface {
int mul(int a,int b);
 }
 interface MyInterfacee{
	 int add(int a,int b);
 }
 interface EvenOdd{
	 int evod(int a);
	 }
 //interface String{
	 //String rev(String s);
	 
 //}
public  class LamdaEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lamda expression with two parameter
		MyInterface mf = (int a,int b)->a*b;
		System.out.println("Multiplicqation  is :...."+mf.mul(4, 7));
		MyInterfacee mf1=(int a,int b)->a+b;
		System.out.println("Sum is......"+mf1.add(9, 9));
		//lamda expression with one parameter
		EvenOdd eo=(int a)->
		{
			if(a%2==0)
				System.out.println("even no");
			else
				System.out.println("odd no");
			return a;
		};
		System.out.println("Number is"+eo.evod(9));
	}}
	//String rs=( s){
	//	String revs="";
		//for(int i=s.length()-1;i>=0;i--) {
		//	char w=s.charAt(i);
			//revs=revs+w;
		
		
	



