import java.io.*;
import java.util.random.*;
import java.util.UUID;

public class GFG {

	public static void main(String[] args, int VALUE) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			Random rand=new Random();
			System.out.println(String.format("%.6f",(double)Math.abs(rand.nextInt())/Integer.max(10, 10)-VALUE));
		}
	}
	

	}


