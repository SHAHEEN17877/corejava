package looping;

public class Reverse {

			public static void main(String[] args) {
				
				int num=23;
						int reverse=0; 
				int temp=num;
				System.out.println("numm");
			
				while(num!=0) {
					int remainder=num%10;
					reverse=reverse*10+remainder;
					num=num/10;
				}
     System.out.println("the reverse of the given number is: "+reverse);
	
			if(reverse==temp) {
				System.out.println("it is a palindrome");
			}
			else
			{
				System.out.println("it is not a palindrome");
			}
}}
