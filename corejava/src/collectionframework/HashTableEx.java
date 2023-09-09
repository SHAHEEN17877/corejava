package collectionframework;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String>hash_table =new Hashtable();
		hash_table.put("l", "sunday");
		hash_table.put("2", "munday");
		hash_table.put("3", "tuesday");
		hash_table.put("4", "wensday");
		hash_table.put("5", "thurday");
		hash_table.put("6", "friday");
		//hash_table.put("null", "sunday");
				System.out.println("hash_table" +hash_table);
				HashMap<String,String>cloneHash=new HashMap<>();
				System.out.println("cloned HashMap: "+cloneHash);
				
		HashMap<Integer,String>map=new HashMap();
		map.put(2, "shaheen");
		map.put(1, "shaikh");
		map.putIfAbsent(3, "a");
		HashMap<Integer,String>map1=new HashMap();
		map.putAll(map1);
		map=(HashMap<Integer,String>)map.clone();
		System.out.println(map1);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("k"));
		Set<Integer>keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+map.get(key));
			
		}
		for(Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
		






	}

}
