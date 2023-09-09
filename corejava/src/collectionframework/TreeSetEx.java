package collectionframework;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> hs=new TreeSet<>();
		hs.add("shaheen");
		hs.add("asma");
		hs.add("prema");
		hs.add("shambi");
		hs.add("shambi");
		System.out.println("Tree Set: "+hs);
        for(String h:hs) {
        	System.out.println(h);
        }
	}

	}

