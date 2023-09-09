//using for loop
package looping;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int no=5;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);

	}

}
