package collectionframework;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListEx {
	public static void main(String[]args) {
		LinkedList<Integer> a1=new LinkedList<Integer>();
		Stack<String> a2=new  Stack<String>();
		a1.add(10);
		a1.add(20);
		a1.add(0, 50);
		a1.add(90);
		a1.addLast(100);
		System.out.println("elements in linked list"+a1);
		a2.push("OMG");
		a2.pop();
		a2.push("kal");
		a2.push("ind");
		a2.push("sdk");
		a2.peek();
		System.out.println("stack list"+a2);
		
		
		
	}
	
	
	

}
