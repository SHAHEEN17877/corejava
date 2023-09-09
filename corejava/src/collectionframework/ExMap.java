package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class ExMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hash_table=new HashMap<>();
		hash_table.put("l", "sunday");
		hash_table.put("2", "munday");
		hash_table.put("3", "tuesday");
		hash_table.put("4", "wensday");
		hash_table.put("5", "thurday");
		hash_table.put("6", "friday");
		hash_table.putIfAbsent("9", "morning");
		hash_table.containsKey("8");
		hash_table.containsValue(hash_table);
		hash_table.entrySet();
		//hash_table.merge("1"," sunday","");
		//hash_table.put("null", "sunday")
		HashMap<String, Integer> languages = new HashMap<>();

        languages.put("c++", 14);
        languages.put("Python", 3);
        languages.put("JavaScript", 1);
        System.out.println("HashMap: " + languages);

        // create copy of languages
        HashMap<String, Integer> cloneLanguages = (HashMap<String, Integer>)languages.clone();
        System.out.println("Cloned HashMap: " + cloneLanguages);
		

	}

}
