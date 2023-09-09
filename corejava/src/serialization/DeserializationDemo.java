package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args)  throws IOException, ClassNotFoundException
	{
		Employei e;
		FileInputStream fis=new FileInputStream("emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		 e = (Employei) ois.readObject();
		 System.out.println("Desirialization object.");
		 System.out.println("name:"+e.name);
		 System.out.println("Id:"+e.id);
		 e.Employei();
		 ois.close();
		 fis.close();

	}

}
