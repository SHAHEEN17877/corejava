package basic;

public class Largest {
	

	public static void main(String[] args) {
		int n1=202,n2=10,n3=22;
		int largest;
		// TODO Auto-generated method stub
		largest = (n1 > n2 && n1> n3)? n1 :((n2> n1 && n2 > n3) ? n2 : n3);
		System.out.printf("largest among %d,%d and %d is %d", n1,n2,n3,largest);

	}

}
