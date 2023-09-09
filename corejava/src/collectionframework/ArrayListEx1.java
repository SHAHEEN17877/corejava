package collectionframework;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample_array[]= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		int length_array=sample_array.length;
		System.out.println("the input elements are as follows :");
		for(int i=0;i<length_array;i++) {
			System.out.println(sample_array[i] + " ");
			
		}
		System.out.println();
		List<String> converted_list= Arrays.asList(sample_array);
		System.out.println("the converted list is as follows:"+converted_list);
		
		

	}

}
