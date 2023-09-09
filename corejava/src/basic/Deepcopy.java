package basic;

public class Deepcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {0,1,2,3,4,5,6};
		int cloneArray[]=intArray.clone();
		System.out.println(intArray==cloneArray);
		for(int i=0;i<cloneArray.length;i++) {
			System.out.print(cloneArray[i]+" ");
		}

	}

}
