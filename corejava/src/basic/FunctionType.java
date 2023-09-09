package basic;

//class displaySquare
//{
//static void square(int x) {
//System.out.println("Square: "+(x*x));
//}
public class FunctionType {
	void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	int sub(int a, int b) {
		return a - b;
	}

	static void mul(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	float div(int a, int b) {
		return a / b;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionType f = new FunctionType();
		f.add(10, 40);
		System.out.println("Substarction: " + f.sub(45, 87));
		mul(4,5);
		System.out.println("Division: " + f.div(80, 40));
		//displaySquare.square(45);
		
}
}