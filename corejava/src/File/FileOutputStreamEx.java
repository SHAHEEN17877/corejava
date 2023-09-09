package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileOutputStream fos=new FileOutputStream("C:Test.txt");
    fos.write(65);
    
    fos.write(66);//G:\\kalsha
    fos.write(67);
    System.out.println("conent written succuccessfully");

}}
