//user defined exception
package basic;

public class ThrowUsage {
static void validate(int age) {
	if(age<18) {
	throw new ArithmeticException("invalid age");
	}
	else {
		System.out.println("valid age");
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowUsage.validate(45);
	}
		}

		
