package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos=new FileOutputStream("C:Test.txt");
String s="java skills are much needed to develop any applications or any real world aspects also ,we write everything in main method we create object inside the main method";
	byte b[]=s.getBytes();
	fos.write(b);
	System.out.println("contents written succussesfully");
	
	}

}
//F:/file11.txt