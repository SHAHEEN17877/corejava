package patterns;
public class Pattern12{

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

	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pattern13(3);
	}}
