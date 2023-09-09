package File;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:Test.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		//bw.write("String is a class.");
		//bw.write("File write demo.");
		//bw.close();
		//System.out.println("file cretaed and edited succussefully......");
		fw.write("wel come");
		fw.close();
		System.out.println("file created");
		FileReader fr = new FileReader("C:Test.txt");
		int t;
		while ((t = fr.read()) != -1) {
			System.out.print((char) t);
		}
		fr.close();
		//System.out.println((char) fr.read());
	}

}
