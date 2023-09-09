package looping;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int i=b;
		//smaller--->bigger--->implicit--->widnening
		System.out.println(i);
		//bigger--->smaller--->Explicit--->narrowing
        int ii=30;
        byte b1=(byte)ii;
        System.out.println(b1);
	}

}
