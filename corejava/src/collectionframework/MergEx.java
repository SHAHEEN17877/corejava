package collectionframework;

import java.util.HashMap;

public class MergEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> prices=new HashMap<>();
		prices.put("shoes", 200);
		prices.put("dress", 400);
		prices.put("kurti", 500);
		System.out.println("HashMap: "+prices);
		
	int returnedValue =prices.merge("shoes", 900, (oldValue,newValue) ->oldValue+newValue);
	System.out.println("price of shoes:"+returnedValue);
	//print updated HashMap
	System.out.println("Updated Hashap:" +prices);
	}

}
