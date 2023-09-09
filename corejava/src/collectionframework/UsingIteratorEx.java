package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class UsingIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("shaheen");
		hs.add("asma");
		hs.add("prema");
		hs.add("shambi");
		hs.add("shambi");
		System.out.println("HashSet: "+hs);
        	System.out.println("*****Using Enhanced for loop********");
    		for(String i:hs) {
    			System.out.println(i);
    		}
    		System.out.println("*****Using Iterator************");
    		Iterator<String> i = hs.iterator();
            while(i.hasNext()) 
                System.out.println(i.next());

        }
	}


