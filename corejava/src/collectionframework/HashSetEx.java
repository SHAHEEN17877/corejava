package collectionframework;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("shaheen");
		hs.add("asma");
		hs.add("prema");
		hs.add("shambi");
		hs.add("shambi");
		System.out.println("HashSet: "+hs);
        for(String h:hs) {
        	System.out.println(h);
        }
	}

}
