package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; // Change this to the desired size

		printXPattern(size);
	}

	public static void printXPattern(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i == j || j == size - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	}


