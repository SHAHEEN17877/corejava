package collectionframework;

import java.util.HashSet;

public class SetsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> even=new HashSet<>();
		even.add(2);
		even.add(6);
		System.out.println("HashSet1: "+even);
		
		HashSet<Integer>numbers=new HashSet<>();
		numbers.add(4);
		numbers.add(8);
		System.out.println("HashSet2: "+numbers);
		
		
	//union set
		numbers.addAll(even);
		System.out.println("Union is: "+numbers);
		numbers.retainAll(even);
		System.out.println("Intersection is: "+numbers);
		numbers.removeAll(even);
		System.out.println("Difference: "+numbers);

	}

}
