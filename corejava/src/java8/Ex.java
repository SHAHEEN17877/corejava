package java8;

import java.util.stream.IntStream;

public class Ex {

	
		static int n = 15;

		private static boolean isPrime(int number) {
			return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
		}System.out.println("Prime checking...."+isPrime(n));

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	

}
}