package patterns;
public class Pattern13 {
public static void Pattern13(int n1){
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int j = 1; j <= n1; j++) {
			System.out.print("* ");
		}
			for (int j1 = 1; j1 <= n1 - n1; j1++) {
				System.out.print(" ");
			}
		for (int i = 1; i <= n1; i++) {
			
			
			}
			System.out.println();
		
for (int j = 1; j <= n1 - i; j++) {
	System.out.print(" ");
	}

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pattern13(3);


	}

}
