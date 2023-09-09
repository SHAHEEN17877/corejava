package collectionframework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		ArrayList<Float>  f1=new ArrayList<>();
		ArrayList<Integer> i2=new ArrayList<>();
		a1.add("shaheen");
		a1.add(1,"asma");
		a1.add("kal");
		a1.add("shambi");
		a1.add("prema");
		System.out.println("my arrayList"+a1);
		a1.remove(2);
		System.out.println("my arrayList"+a1);
		a1.set(1, "musk");
		System.out.println("my arrayList"+a1);
		a1.equals("musk");
		System.out.println("my arrayList"+a1);
		a1.get(2);
		System.out.println("my arrayList"+a1.get(2));
		a1.lastIndexOf(a1);
		System.out.println("my arrayList"+a1);
		a1.isEmpty();
		System.out.println("my arrayList"+a1);
		f1.add(2.4f);
		System.out.println("my arrayList"+f1);
		i2.add(100);
		System.out.println("my arrayList"+f1);
		Collections.sort(a1);
		System.out.println("Sorting Data:");
		for(String str:a1) {
			System.out.println(str);
			
		}
		a1.addAll(a1);
		System.out.println("my arrayList"+a1);
		System.out.println("------");
		List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
        Collections.sort(list, Collections.reverseOrder());
 
        System.out.println(list);
        System.out.println("=====================");
        
        }
		
	}


