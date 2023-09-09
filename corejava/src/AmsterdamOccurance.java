import java.util.Scanner;

 class Amsterdam {
	public int countAm(String s) {
		String str = s.toLowerCase();
		int cnt = 0;
		String a[] = str.split(" ");
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i].equals("am"));
			{
				cnt = cnt + 1;
			}
			System.out.println(a[i]);
		}
		return cnt;
	}
}
public class AmsterdamOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		Amsterdam a1 = new Amsterdam();
		int count = a1.countAm(str);
		System.out.print(count);

	}

}
