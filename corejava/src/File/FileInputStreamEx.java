package File;
//import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:Test.txt");
		int i= fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();//G:\\kalsha
			
		}
		fis.close();

	}

}
