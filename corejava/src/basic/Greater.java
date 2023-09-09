package basic;

public class Greater {
	void max(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("a is greater");
			}
		else if(b>a && b>c) {
			System.out.println(" b is greater");
		}
		else if(c>a && c>b) {
			System.out.println("c is greater");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greater g=new Greater();
		g.max(4,7,10);

	}

}
