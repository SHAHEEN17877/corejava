package java8;

import java.util.ArrayList;
import java.util.List;

class MathUtils{
	static int square(int num) {
		return num*num;
	}
}

public class MethodRefEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numbers=new ArrayList<>();
numbers.add(3);
numbers.add(5);
numbers.add(9);
//using lamda EXp
numbers.forEach(x->System.out.println(x));
System.out.println("Using method reference:");
//method resolution with scope resolution operation ::
numbers.forEach(System.out::println);
//method reference with a static method
System.out.println("Using static method square:");
List<Integer>squareNumbers=new ArrayList<>();
numbers.forEach(n->squareNumbers.add(MathUtils.square(n)));
squareNumbers.forEach(System.out::println);
	}

}
