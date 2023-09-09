package basic;

public class Shallow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]= {{1,2,3,4},{6,8,9}};
		int cloneArray[][]=intArray.clone();
		System.out.println(intArray[0]==cloneArray[0]);
		System.out.println(intArray[1]==cloneArray[1]);

	}

}
