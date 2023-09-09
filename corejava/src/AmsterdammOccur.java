import java.util.Scanner;
class Amsterdamm1{
	public int countAm(String s) {
		String str=s.toLowerCase();
		System.out.println("str: "+str);
		int cnt=0;
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++) {
			if(a[i].equals("am"));
			cnt=cnt+1;
			}
		System.out.println("a[i]");
		
	return cnt;
}
}
public class AmsterdammOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		Amsterdamm1 a=new Amsterdamm1();
		int count=a.countAm(str);
		System.out.println(count);
		

	}

}
