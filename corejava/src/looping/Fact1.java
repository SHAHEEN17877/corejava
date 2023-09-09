//using while
package looping;

public class Fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2;
		int fact=1;
		int i=1;while(i<=number) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial: "+fact);

	}
}