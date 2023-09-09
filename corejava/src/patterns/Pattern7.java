package patterns;

public class Pattern7 {
	public static void pattern(int n) {
		int i,j;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(  " * ");
			}
		     System.out.println();
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=3,m=5,o=6;
     pattern(n);
     pattern(m);
     pattern(o);
     
	}

}
